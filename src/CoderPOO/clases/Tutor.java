package CoderPOO.clases;

import CoderPOO.interfaces.IDocente;
import CoderPOO.interfaces.IEstudiante;

import java.util.List;

public class Tutor extends Empleado implements IEstudiante, IDocente {

    private List<Curso> cursosTutorias;
    private List<Curso> cursosComoEstudiante;

    //creo un tutor llamando al constructor de empleado
    public Tutor(Integer id_empleado, String nombre, String apellido) {
        super(id_empleado, nombre, apellido);
    }

    //getters y setters

    public List<Curso> getCursosTutorias() {
        return cursosTutorias;
    }

    public void setCursosTutorias(List<Curso> cursosTutorias) {
        this.cursosTutorias = cursosTutorias;
    }

    public List<Curso> getCursosComoEstudiante() {
        return cursosComoEstudiante;
    }

    public void setCursosComoEstudiante(List<Curso> cursosComoEstudiante) {
        this.cursosComoEstudiante = cursosComoEstudiante;
    }

    //implementación de métodos abstractos en empleado
    @Override
    public void calcularSueldo() {

        int horasTrabajadas = 0;
        int valorInvertido = 0;

        for (Curso curso : cursosTutorias) {
            horasTrabajadas += curso.getCantidadHoras();
        }

        //if(cursosComoEstudiante.size() > 0){}
        for (Curso curso : cursosComoEstudiante) {
            valorInvertido += curso.getValorDelCurso();
        }

        this.setSueldo(horasTrabajadas * 500 - valorInvertido);
    }

    @Override
    public void mostrarSueldo() {
        System.out.println("El sueldo del tutor es: " + this.getSueldo());
    }


    @Override
    public void trabajar() {
        System.out.println("------- El tutor empieza a trabajar -------");
        System.out.println("El tutor toma asistencia");
        System.out.println("El tutor responde consultas");
        System.out.println("El tutor prepara after class (con mucho amor)");
        System.out.println("------- El tutor termina de trabajar ---------");
    }

    @Override
    public void estudiar() {
        System.out.println("Estudiando");
    }

    @Override
    public void darClases() {
        System.out.println(":) El tutor da after class en Coder");
    }
}
