package ejs;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ej2_interescompuesto {
    public static void main(String[] args){
        BigDecimal ini = new BigDecimal("10000.00"); //EL MONTO PRINCIPAL
        BigDecimal ratio = new BigDecimal("0.05"); //EL INTERÉS AÑADIDO
        int años = 10; //NÚMERO DE AÑOS
        int vecesDepositado = 4;

        BigDecimal cantidad = calculoInteres(ini, ratio, años, vecesDepositado);
        System.out.println("Cantidad luego de " + años + " años: " + cantidad);

    }

    public static BigDecimal calculoInteres(BigDecimal p, BigDecimal r, int n, int x){
        BigDecimal uno = BigDecimal.ONE;
        BigDecimal ratioDividido = r.divide(new BigDecimal(x), 10, RoundingMode.HALF_UP);
        BigDecimal exponente = new BigDecimal(x*n);

        BigDecimal base = uno.add(ratioDividido);
        BigDecimal resultado = p.multiply(base.pow(exponente.intValueExact()));

        return resultado.setScale(2, RoundingMode.HALF_UP);
    }
}
