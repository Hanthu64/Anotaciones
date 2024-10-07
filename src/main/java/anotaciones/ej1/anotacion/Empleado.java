package anotaciones.ej1.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Empleados.class)
@Documented
public @interface Empleado {
    String nombre();
    String apellidos();
    String dni();
    String direccion();
    int telefono();
    String clase();
    int codigoTaller() default 0;
    String perfil() default "";
    String categoria() default "";
    int codigoDespacho() default 0;
}