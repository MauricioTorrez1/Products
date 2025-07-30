//Capa de Servicio encargada de la lógica y operación de la aplicación.
//Nota: En este caso por tratarse de un ejemplo básico solo se incluye un método HTTP del tipo GET.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Lazy
@Service //@Service le indica a Spring que la clase es un bean de servicio para almacenarlo en su contenedor y gestionarlo
/* Existen 3 tipos de inyeccion de dependencias
- Inyeccion por Constructor
- Inyección por Setter
- Inyección por Campo (a utilizar en este proyecto) campo = atributo
 */
/*ConditionalOnProperty permite condicionar la creación o utilización de beans a partir de una condicion establecida en el archvio application.properties
En este caso si la propiedad con nombre service.products tiene el valor "list" el bean a usar será esta clase 
*/
@ConditionalOnProperty(name = "service.products", havingValue = "list")                                                                               
public class ProductsServiceImpl {
//Esta lista simula una base de datos, pero en la vida real esta base de datos se conectaria a través de la capa de Acceso a Datos.
     List<Product> products;

    {
        products = new ArrayList<>(Arrays.asList(
                new Product(1, "Laptop", 799.99, 10),
                new Product(2, "Smartphone", 499.99, 250),
                new Product(3, "Tablet", 299.99, 15),
                new Product(4, "Smartwatch", 199.99, 30)
        ));

    }
//Se implementa el método contenido en la interface ProductService creada anteriormente
         @Override
         public List<Product> getProducts(){
             
        return products;
        }




}
