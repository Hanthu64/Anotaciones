package anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Estudiantes {
    Estudiante[] value();
}
