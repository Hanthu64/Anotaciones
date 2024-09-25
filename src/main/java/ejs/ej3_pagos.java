package ejs;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ej3_pagos {
    public static void main(String[] args){
        BigDecimal prestamo = new BigDecimal("200000.00");
        int años = 30;
        int meses = 12;
        BigDecimal ratio = new BigDecimal(0.05/meses);
        int pagos = años*meses;

        BigDecimal resultado = PMT(prestamo, ratio, pagos);
        System.out.println("Préstamo inicial de " + prestamo + ".");
        System.out.println("Tasa inicial de 5%.");
        System.out.println("Pago mensual de " + resultado + "€.");
    }

    public static BigDecimal PMT(BigDecimal p, BigDecimal r, int n){
        BigDecimal uno = BigDecimal.ONE;
        BigDecimal montoPorRatio = p.multiply(r);
        BigDecimal aux = uno.add(r);
        int exp = -n;
        BigDecimal pow = BigDecimal.ONE.divide(aux.pow(Math.abs(exp)), MathContext.DECIMAL128);
        BigDecimal aux2 = uno.subtract(pow);

        return montoPorRatio.divide(aux2, RoundingMode.HALF_UP).setScale(2,  RoundingMode.HALF_EVEN);
    }
}
