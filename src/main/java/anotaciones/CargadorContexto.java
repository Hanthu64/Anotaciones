package anotaciones;

import java.util.List;

public class CargadorContexto {
    public static List<Clase> cargaContextoInstituto() {
        Estudiante[] estudiantesAnnotation = Clase.class.getAnnotationsByType(Estudiante.class);

        for(Estudiante estudianteAnnotation : estudiantesAnnotation){
            System.out.println(estudianteAnnotation);
        }

        return List.of();
    }
}
