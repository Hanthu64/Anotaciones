package ejs;

import java.math.*;

public class Posicion {
    BigDecimal latitud;
    BigDecimal longitud;

    public Posicion(BigDecimal latitud, BigDecimal longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public BigDecimal DistanciaKm(Posicion a){
        BigDecimal radioTierraKm = new BigDecimal("6378");
        BigDecimal difLatitud = a.latitud.subtract(this.latitud);
        BigDecimal difLongitud = a.longitud.subtract(this.longitud);

        difLatitud = enRadianes(difLatitud);
        difLongitud = enRadianes(difLongitud);

        BigDecimal cosLatitudOrigen =  new BigDecimal(Math.cos(this.enRadianes(latitud).doubleValue()));
        BigDecimal cosLatitudDestino =  new BigDecimal(Math.cos(a.enRadianes(latitud).doubleValue()));

        BigDecimal sinLatitud = difLatitud.divide(new BigDecimal("2"), RoundingMode.HALF_UP);
        BigDecimal sinLongitud = difLongitud.divide(new BigDecimal("2"), RoundingMode.HALF_UP);

        sinLatitud = new BigDecimal(Math.pow(sinLatitud.doubleValue(), 2));
        sinLongitud = new BigDecimal(Math.pow(sinLongitud.doubleValue(), 2));

        BigDecimal puntoA = cosLatitudOrigen.multiply(cosLatitudDestino);
        puntoA = puntoA.multiply(sinLongitud);
        puntoA = puntoA.add(sinLatitud);

        BigDecimal uno = BigDecimal.ONE;
        BigDecimal puntoC = new BigDecimal(Math.sqrt(puntoA.doubleValue()));
        BigDecimal puntoCaux = new BigDecimal(Math.sqrt(uno.subtract(puntoA).doubleValue()));
        puntoC = new BigDecimal(Math.atan2(puntoC.doubleValue(), puntoCaux.doubleValue()));
        puntoC = puntoC.multiply(new BigDecimal("2"));

        BigDecimal resultado = radioTierraKm.multiply(puntoC);
        return resultado.setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal enRadianes(BigDecimal valor){
        BigDecimal PI = new BigDecimal(Math.PI, MathContext.DECIMAL128);
        BigDecimal cientoOchenta = new BigDecimal("180");
        BigDecimal aux = PI.divide(cientoOchenta, RoundingMode.HALF_UP);
        return valor.multiply(aux);
    }
    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }
}
