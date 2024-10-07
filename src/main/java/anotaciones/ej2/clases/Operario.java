package anotaciones.ej2.clases;

public abstract class Operario extends Empleado {
    private int codigoTaller;

    public Operario(String nombre, String apellidos, String direccion, String dni, int telefono, int codigoTaller) {
        super(nombre, apellidos, direccion, dni, telefono);
        this.codigoTaller = codigoTaller;
    }

    public int getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(int codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    @Override
    public String toString() {
        return "codigoTaller=" + codigoTaller + ", "
                + super.toString() + "}";
    }
}
