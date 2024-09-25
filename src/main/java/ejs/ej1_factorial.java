package ejs;

import java.math.BigInteger;

public class ej1_factorial {
    public static void main(String[] args) {
        /*Ejercicio 1*/
        BigInteger n = new BigInteger("10");
        BigInteger acum = BigInteger.ONE;
        BigInteger conteo = BigInteger.ONE;

        while(n.compareTo(BigInteger.ZERO) > 0){
            acum = acum.multiply(conteo);
            System.out.println(acum);
            n = n.subtract(BigInteger.ONE);
            conteo = conteo.add(BigInteger.valueOf(1));
        }
    }
}