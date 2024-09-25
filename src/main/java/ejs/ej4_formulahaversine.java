package ejs;

import java.math.BigDecimal;

public class ej4_formulahaversine {
    public static void main(String[] args){
        Posicion igualada = new Posicion(new BigDecimal("41.57879"),  new BigDecimal("1.617221"));
        Posicion granada = new Posicion(new BigDecimal("37.176487"),  new BigDecimal("-3.597929"));

        BigDecimal distancia = igualada.DistanciaKm(granada);
        System.out.println("La distancia es de " + distancia + "km");
    }
}
