package anotaciones.ej2.main;

import anotaciones.ej2.clases.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrincipalEj2 {
    public static void main(String[] args){
        Empresa e = cargadorDeContexto();
        System.out.println(e);
    }
    public static Empresa cargadorDeContexto() {
        anotaciones.ej2.anotacion.Directivo[] directivosAnnotation = Empresa.class.getAnnotationsByType(anotaciones.ej2.anotacion.Directivo.class);
        anotaciones.ej2.anotacion.Oficial[] oficialesAnnotation = Empresa.class.getAnnotationsByType(anotaciones.ej2.anotacion.Oficial.class);
        anotaciones.ej2.anotacion.Tecnico[] tecnicosAnnotation = Empresa.class.getAnnotationsByType(anotaciones.ej2.anotacion.Tecnico.class);

        List<anotaciones.ej2.clases.Empleado> empleadosEnEmpresa = new ArrayList<>();
        int cuentaEmpleados = 0;
        for (anotaciones.ej2.anotacion.Directivo directivoAnnotation : directivosAnnotation) {

            String nombre = directivosAnnotation[cuentaEmpleados].nombre();
            String apellidos = directivosAnnotation[cuentaEmpleados].apellidos();
            String dni = directivosAnnotation[cuentaEmpleados].dni();
            String direccion = directivosAnnotation[cuentaEmpleados].direccion();
            int telefono = directivosAnnotation[cuentaEmpleados].telefono();
            int codigoDespacho = directivosAnnotation[cuentaEmpleados].codigoDespacho();
            Directivo aux = new Directivo(nombre, apellidos, dni, direccion, telefono, codigoDespacho);
            empleadosEnEmpresa.add(aux);
            cuentaEmpleados++;
        }

        cuentaEmpleados = 0;
        for (anotaciones.ej2.anotacion.Oficial oficialAnnotation : oficialesAnnotation) {

            String nombre = oficialesAnnotation[cuentaEmpleados].nombre();
            String apellidos = oficialesAnnotation[cuentaEmpleados].apellidos();
            String dni = oficialesAnnotation[cuentaEmpleados].dni();
            String direccion = oficialesAnnotation[cuentaEmpleados].direccion();
            int telefono = oficialesAnnotation[cuentaEmpleados].telefono();
            int codigoTaller = oficialesAnnotation[cuentaEmpleados].codigoTaller();
            String categoria = oficialesAnnotation[cuentaEmpleados].categoria();
            Oficial aux = new Oficial(nombre, apellidos, dni, direccion, telefono, codigoTaller, categoria);
            empleadosEnEmpresa.add(aux);
            cuentaEmpleados++;
        }

        cuentaEmpleados = 0;
        for (anotaciones.ej2.anotacion.Tecnico tecnicoAnnotation : tecnicosAnnotation) {

            String nombre = tecnicosAnnotation[cuentaEmpleados].nombre();
            String apellidos = tecnicosAnnotation[cuentaEmpleados].apellidos();
            String dni = tecnicosAnnotation[cuentaEmpleados].dni();
            String direccion = tecnicosAnnotation[cuentaEmpleados].direccion();
            int telefono = tecnicosAnnotation[cuentaEmpleados].telefono();
            int codigoTaller = tecnicosAnnotation[cuentaEmpleados].codigoTaller();
            String perfil = tecnicosAnnotation[cuentaEmpleados].perfil();
            Tecnico aux = new Tecnico(nombre, apellidos, dni, direccion, telefono, codigoTaller, perfil);
            empleadosEnEmpresa.add(aux);
            cuentaEmpleados++;
        }

        Empresa e = new Empresa("Example Enterprises", empleadosEnEmpresa);
        return e;
    }
}
