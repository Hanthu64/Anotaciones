package anotaciones.ej4.clases;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
@Data
public class Refresco {
    String nombre;
    int numLatas;

    public Refresco(@NonNull String nombre, @NonNull int numLatas) {
        this.nombre = nombre;
        this.numLatas = numLatas;
    }
}

/*
@NonNull PROHIBE que la variable tenga valor "null".
@Value convierte la clase en final y las variables en private, sin necesidad de declararlo manualmente.
@Builder permite que utilices un constructor con el patrón de diseño builder, con una sintaxis como esta:
Clase nombreclase = Clase.builder()
                    .variable(valor)
                    .build();
@Data genera automáticamente constructores, getters, setters, toString, entre otros.
 */
