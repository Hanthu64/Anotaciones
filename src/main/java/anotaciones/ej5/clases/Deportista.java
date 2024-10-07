package anotaciones.ej5.clases;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
@SuperBuilder
public abstract class Deportista {
    private String nombre;
    private int edad;
    private String pais;

}
