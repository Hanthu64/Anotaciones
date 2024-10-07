package anotaciones.ej5.main;

import anotaciones.ej5.clases.Atleta;
import lombok.experimental.SuperBuilder;

public class PrincipalEj5 {
    public static void main(String[] args){
        Atleta a = Atleta.builder()
                .nombre("Carlos Fernández")
                .edad(32)
                .pais("España")
                .competencia("100m vallas")
                .record(13.82)
                .build();

        System.out.println(a);
    }
}
