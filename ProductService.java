//Capa de Servicio encargada de la lógica y operación de la aplicación.
//Nota: En este caso por tratarse de un ejemplo básico solo se incluye un método HTTP del tipo GET.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
//Método GET para obtener la lista de los productos disponibles incluyendo el id, nombre, precio y stock.
         public List<Product> getProducts(){
             return products;
        }




}
