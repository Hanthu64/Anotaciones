package anotaciones.ej1.clases;

public abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private int telefono;
    private String clase;

    public Empleado(String nombre, String apellidos, String direccion, String dni, int telefono, String clase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                ", clase='" + clase + '\'' +
                '}';
    }
}
