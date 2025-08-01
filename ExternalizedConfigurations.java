package cursoSpringBoot.configurations;


//Archivo tipo POJO que contiene las configuraciones de la aplicacion.
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration //Indica que la clase es un archivo de configuración
@ConfigurationProperties(prefix = "app")
public class ExternalizedConfigurations {


    //Los atributos y las propiedades deben tener el mismo nombre y el mismo orden
    private String name;
    private String version;
    private String autor;
    private String language;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ExternalizedConfigurations: " + "\n" +
                "nombre=" + this.name + "\n" +
                "pais=" + this.country + "\n" +
                "autor=" + this.autor + "\n" +
                "idioma=" + this.language;

    }
}
