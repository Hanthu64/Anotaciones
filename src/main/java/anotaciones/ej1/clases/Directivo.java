package anotaciones.ej1.clases;

public final class Directivo extends Empleado{
    private int codigoDespacho;

    public Directivo(String nombre, String apellidos, String direccion, String dni, int telefono, String clase, int codigoDespacho) {
        super(nombre, apellidos, direccion, dni, telefono, clase);
        this.codigoDespacho = codigoDespacho;
    }

    public int getCodigoDespacho() {
        return codigoDespacho;
    }

    public void setCodigoDespacho(int codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    @Override
    public String toString() {
        return "\nDirectivo{" +
                "codigoDespacho=" + codigoDespacho + ", " + super.toString();
    }
}
