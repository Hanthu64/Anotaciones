package anotaciones.ej3.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Tareas.class)
@Documented
public @interface Tarea {
    String tituloTarea();
    String descripcion();
    String diaSemana();
    String hora();
}
