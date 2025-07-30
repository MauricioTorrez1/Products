//Capa de Modelo encargada de la definición de los objetos o entidades incluyendo sus atributos y relaciones, clase del tipo POJO que contiene atributos, getters, setters y constructor.
public class Product {
    //Tipos de datos referenciales y no primitivos para manejar correctamente valores nulos.
    private Integer id;
    private String nombre;
    private Double precio;
    private Integer stock;

    //Constructor vacio para que pueda ser usado por la biblioteca JACKSON para la deserialización
    public Product() {

    }
    
    public Product(Integer id, String nombre, Double precio, Integer stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
