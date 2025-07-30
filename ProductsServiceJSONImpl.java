//Bean que simula el proceso de deserealización de un formato JSON.
//En vez de leer los productos de una base de datos(lista) se leen desde una API que envia un formato JSON.
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import cursoSpringBoot.domain.Product;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

//@Primary //Para que sea el bean de servicio prioritario o predeterminado
@Service() 
/*@Service() para ser un bean de servicio almacenado en el contenedor de Spring, entre parentesis se puede
colocar el nombre que queramos para nuestro bean y poder usarlo con la anotación @Qualifier
*/
@ConditionalOnProperty(name = "service.products", havingValue = "json")
public class ProductsServiceJSONImpl implements ProductService {


    @Override
    public List<Product> getProducts() {

        List<Product> products;

        try {
            //.readValue permite la deserealización del formato JSON
            products = new ObjectMapper()
                    .readValue(this.getClass().getResourceAsStream("/products.json"),
                            new TypeReference<List<Product>>() {});
            return products;
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }


    }
}
