package anotaciones.ej3.main;

import anotaciones.ej1.clases.Empresa;
import anotaciones.ej3.anotacion.Tarea;
import anotaciones.ej3.clases.*;
import anotaciones.ej3.anotacion.*;

import java.util.ArrayList;
import java.util.List;

public class PrincipalEj3 {

    public static void main(String[] args){
        AgendaSemana a = cargadorDeContexto();
        System.out.println(a);
    }

    public static AgendaSemana cargadorDeContexto(){
        Tarea[] tareasAnnotation = AgendaSemana.class.getAnnotationsByType(Tarea.class);

        List<anotaciones.ej3.clases.Tarea> tareasEnAgenda = new ArrayList<>();
        int cuentaTareas = 0;
        for (Tarea tareaAnnotation : tareasAnnotation) {

            String tituloTarea = tareasAnnotation[cuentaTareas].tituloTarea();
            String descripcion = tareasAnnotation[cuentaTareas].descripcion();
            String diaSemana = tareasAnnotation[cuentaTareas].diaSemana();
            String hora = tareasAnnotation[cuentaTareas].hora();

            anotaciones.ej3.clases.Tarea aux = new anotaciones.ej3.clases.Tarea(tituloTarea, descripcion, diaSemana, hora);
            tareasEnAgenda.add(aux);
            cuentaTareas++;
        }

        AgendaSemana a = new AgendaSemana(tareasEnAgenda);
        return a;
    }
}
