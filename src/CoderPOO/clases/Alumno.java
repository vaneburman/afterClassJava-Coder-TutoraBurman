package CoderPOO.clases;

import CoderPOO.interfaces.IEstudiante;

import java.util.List;

public class Alumno implements IEstudiante {
    private String nombre;
    private String apellido;
    private int legajo;
    private List<Curso> cursos;

    //Constructor del alumno. No le agrego cursos, porque es dinámico, se va a ir armando la lista conforme pase el tiempo.
    public Alumno(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    //implementación del comportamiento que dicta la interfaz IEstudiante
    @Override
    public void estudiar() {
        System.out.println("Estudiando");
    }

    //getter y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
