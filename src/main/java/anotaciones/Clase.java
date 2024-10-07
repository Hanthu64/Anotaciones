package anotaciones;

@Estudiantes(
        {
                @Estudiante(nombre = "Jose", fechaNacimiento = "18/06/2002", curso = 2),
                @Estudiante(nombre = "Jose", fechaNacimiento = "18/06/2001", curso = 1)
        }
)
public class Clase {
    private String curso;
    private String aula;

    public Clase(String curso, String aula) {
        this.curso = curso;
        this.aula = aula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

}
