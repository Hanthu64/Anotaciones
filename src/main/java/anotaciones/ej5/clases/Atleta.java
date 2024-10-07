package anotaciones.ej5.clases;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString(callSuper = true)
@SuperBuilder
public final class Atleta extends Deportista{
    private String competencia;
    private double record;
}
