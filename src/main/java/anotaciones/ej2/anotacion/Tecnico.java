package anotaciones.ej2.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Tecnico {
    String nombre();
    String apellidos();
    String dni();
    String direccion();
    int telefono();
    String clase();
    int codigoTaller();
    String perfil();
}
