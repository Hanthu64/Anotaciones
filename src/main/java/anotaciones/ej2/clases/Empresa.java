package anotaciones.ej2.clases;

import java.util.List;

@anotaciones.ej2.anotacion.Oficial(
        nombre = "Paco",
        apellidos = "Paquez",
        direccion = "Avenida Cordoba, n2",
        dni = "11223344P",
        telefono = 612345678,
        clase = "Oficial",
        codigoTaller = 1,
        categoria = "Ejemplo"
)

@anotaciones.ej2.anotacion.Tecnico(
        nombre = "Esteban",
        apellidos = "Estevez",
        direccion = "Calle Cadiz, n3",
        dni = "44332211A",
        telefono = 687654321,
        clase = "Tecnico",
        codigoTaller = 2,
        perfil = "Ejemplo"
)

@anotaciones.ej2.anotacion.Directivo(
        nombre = "Pablo",
        apellidos = "Marquez",
        direccion = "Calle Almeria, n12",
        dni = "11223344B",
        telefono = 611223344,
        clase = "Directivo",
        codigoDespacho = 3
)

public class Empresa {
    private String nombre;
    private List<Empleado> empleados;


    public Empresa(String nombre, List<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
