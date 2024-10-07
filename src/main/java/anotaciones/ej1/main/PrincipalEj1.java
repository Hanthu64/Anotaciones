package anotaciones.ej1.main;

import anotaciones.ej1.anotacion.Empleado;
import anotaciones.ej1.clases.*;

/*Crea un programa mediante una clase Empresa que use una anotación @Empleado como la siguiente:

@Empleado(
    nombre = "Armancio",
    apellidos = "Ortega",
    dni = "66554433F",
    direccion = "AV.DIPUTACION S/N P.I. SABON 15142, ARTEIXO, LA CORUÑA",
    telefono = "981185596",
	clase = "Directivo",
	codigoDespacho = "1"
)
 */

import java.util.*;

public class PrincipalEj1 {
    public static void main(String[] args){
        Empresa e = cargadorDeContexto();
        System.out.println(e);
    }
    public static Empresa cargadorDeContexto() {
        Empleado[] empleadosAnnotation = Empresa.class.getAnnotationsByType(Empleado.class);

        List<anotaciones.ej1.clases.Empleado> empleadosEnEmpresa = new ArrayList<>();
        int cuentaEmpleados = 0;
        for (Empleado empleadoAnnotation : empleadosAnnotation) {

            String nombre = empleadosAnnotation[cuentaEmpleados].nombre();
            String apellidos = empleadosAnnotation[cuentaEmpleados].apellidos();
            String dni = empleadosAnnotation[cuentaEmpleados].dni();
            String direccion = empleadosAnnotation[cuentaEmpleados].direccion();
            int telefono = empleadosAnnotation[cuentaEmpleados].telefono();
            String clase = empleadosAnnotation[cuentaEmpleados].clase();

            int codigoTaller = 0;
            if(empleadosAnnotation[cuentaEmpleados].codigoTaller() > 0){
                codigoTaller = empleadosAnnotation[cuentaEmpleados].codigoTaller();
            }

            int codigoDespacho = 0;
            if(empleadosAnnotation[cuentaEmpleados].codigoDespacho() > 0){
                codigoDespacho = empleadosAnnotation[cuentaEmpleados].codigoDespacho();
            }

            String categoria = null;
            if(!empleadosAnnotation[cuentaEmpleados].categoria().isEmpty()){
                categoria = empleadosAnnotation[cuentaEmpleados].categoria();
            }

            String perfil = null;
            if(!empleadosAnnotation[cuentaEmpleados].perfil().isEmpty()){
                perfil = empleadosAnnotation[cuentaEmpleados].perfil();
            }

            if(clase.equals("Oficial")){
                Oficial aux = new Oficial(nombre, apellidos, dni, direccion, telefono, clase, codigoTaller, categoria);
                empleadosEnEmpresa.add(aux);
            }else if(clase.equals("Tecnico")){
                Tecnico aux = new Tecnico(nombre, apellidos, dni, direccion, telefono, clase, codigoTaller, perfil);
                empleadosEnEmpresa.add(aux);
            }else if(clase.equals("Directivo")){
                Directivo aux = new Directivo(nombre, apellidos, dni, direccion, telefono, clase, codigoDespacho);
                empleadosEnEmpresa.add(aux);
            }else{
                System.out.println("No se puede deducir la clase del empleado.");
            }
            cuentaEmpleados++;
        }

        Empresa e = new Empresa("Example Enterprises", empleadosEnEmpresa);
        return e;
    }
}
