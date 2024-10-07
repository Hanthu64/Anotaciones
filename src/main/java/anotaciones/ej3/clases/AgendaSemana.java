package anotaciones.ej3.clases;

import java.util.List;

@anotaciones.ej3.anotacion.Tarea(
    tituloTarea = "Hacer la cama.",
        descripcion = "Hacer la cama luego de levantarme.",
        diaSemana = "Todos.",
        hora = "8:00."
)

@anotaciones.ej3.anotacion.Tarea(
        tituloTarea = "Prepararme para el examen.",
        descripcion = "Fijar una hora y fecha para prepararme para un examen.",
        diaSemana = "Lunes.",
        hora = "16:00."
)

@anotaciones.ej3.anotacion.Tarea(
        tituloTarea = "Buscar un cargador.",
        descripcion = "Mi cargador del portátil ha dejado de funcionar, tengo que salir a comprar otro.",
        diaSemana = "Sábado.",
        hora = "12:00."
)

public final class AgendaSemana {
    private List<Tarea> tareas;

    public AgendaSemana(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "AGENDA: \n" + tareas;
    }
}
