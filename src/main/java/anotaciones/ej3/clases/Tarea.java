package anotaciones.ej3.clases;

public final class Tarea {
    private String tituloTarea;
    private String descripcion;
    private String diaSemana;
    private String hora;

    public Tarea(String tituloTarea, String descripcion, String diaSemana, String hora) {
        this.tituloTarea = tituloTarea;
        this.descripcion = descripcion;
        this.diaSemana = diaSemana;
        this.hora = hora;
    }

    public String getTituloTarea() {
        return tituloTarea;
    }

    public void setTituloTarea(String tituloTarea) {
        this.tituloTarea = tituloTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Título: " + tituloTarea + '\n' +
                "Descripción: " + descripcion + "\n" +
                "Dia de la semana: " + diaSemana + "\n" +
                "Hora: " + hora + "\n" +
                "------------------------------------" + "\n";
    }
}
