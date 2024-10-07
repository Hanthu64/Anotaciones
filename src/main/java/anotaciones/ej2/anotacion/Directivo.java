package anotaciones.ej2.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Directivos.class)
@Documented
public @interface Directivo {
    String nombre();
    String apellidos();
    String dni();
    String direccion();
    int telefono();
    String clase();
    int codigoDespacho();
}
