package anotaciones.ej4;
import anotaciones.ej4.clases.Refresco;
import lombok.Data;

public class PrincipalEj4 {
    public static void main(String[] args){
        Refresco monster = new Refresco("Monster", 5);
        System.out.println(monster);

        Refresco fanta = Refresco.builder()
                .nombre("Fanta")
                .numLatas(7)
                .build();

        System.out.println(fanta);

        try{
            Refresco refresconulo = Refresco.builder()
                    .nombre(null)
                    .numLatas(0)
                    .build();
        }catch(Exception e){
            System.out.println("¡UN REFRESCO NO PUEDE SER NULL!");
        }
    }
}
