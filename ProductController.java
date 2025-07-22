//Capa de Presentación puerta de entrada de la API. Su único trabajo es recibir las peticiones HTTP del cliente, validar la información básica y devolver una respuesta HTTP. No contiene lógica de negocio.
import cursoSpringBoot.domain.Product;
import cursoSpringBoot.service.ProductsServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {
   //Esta línea de código sirve para crear un objeto (una instancia) de la clase ProductsServiceImpl y acceder al método .getProducts(), en otras palabras esta capa (Presentación o Controller) 
   //llama a la capa encargada de la lógica (Service) donde se encuentra el método GET.
   //Esto es una mala práctica ya que se deberia de realizar por medio de la inyección de dependencias.
    ProductsServiceImpl productsService = new ProductsServiceImpl();
    @GetMapping
    public ResponseEntity<?> getProducts(){

        List<Product> products = productsService.getProducts();

        return ResponseEntity.ok(products);

    }
}
