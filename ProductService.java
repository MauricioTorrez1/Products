//Interfaz del tipo ProductService que contiene la definicion de los métodos a utilizar.
import cursoSpringBoot.domain.Product;

import java.util.List;
//Las interfaces van dentro la capa de servicios
public interface ProductService {

    //En las interfaces los métodos únicamente se definen, pero no se implementan.

    List<Product> getProducts();
}
