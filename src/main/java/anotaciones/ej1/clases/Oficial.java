package anotaciones.ej1.clases;

public final class Oficial extends Operario{
    String categoría;

    public Oficial(String nombre, String apellidos, String direccion, String dni, int telefono, String clase, int codigoTaller, String categoría) {
        super(nombre, apellidos, direccion, dni, telefono, clase, codigoTaller);
        this.categoría = categoría;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    @Override
    public String toString() {
        return "\nOficial{" +
                "categoría='" + categoría + '\'' + ", " + super.toString();
    }
}
