//Capa de Presentación puerta de entrada de la API. Su único trabajo es recibir las peticiones HTTP del cliente, validar la información básica y devolver una respuesta HTTP. No contiene lógica de negocio.
import cursoSpringBoot.domain.Product;
import cursoSpringBoot.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {
   /*Esta línea de código sirve para crear un objeto (una instancia) de la clase ProductsServiceImpl y acceder al método .getProducts(), 
   en otras palabras esta capa (Presentación o Controller) 
   llama a la capa encargada de la lógica (Service) donde se encuentra el método GET.
    ProductsServiceImpl productsService = new ProductsServiceImpl(); Esto es una mala práctica ya que se deberia de realizar por medio de la inyección de dependencias.
   */
   @Autowired//@Autowired inyecta automaticamente una dependencia en este caso de la interfaz ProductService.
   @Lazy //@Lazy crea la instancia del bean de servicio hasta que sea ejecutado
   //@Qualifier("jsonResourceService" )  @Qualifier() especifica al bean a inyectar cuando existen multiples beans y tiene prioridad sobre @Primary
    private ProductService productsService;//Instancia de la interfaz ProductService
   @GetMapping
    public ResponseEntity<?> getProducts(){

        List<Product> products = productsService.getProducts();//De la interfaz inyectada se ocupa el método .getProducts

        return ResponseEntity.ok(products);

    }
}
