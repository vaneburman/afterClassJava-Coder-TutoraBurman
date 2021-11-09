package CoderPOO.clases;

import CoderPOO.interfaces.IDocente;
import CoderPOO.interfaces.ISpeaker;

import java.util.List;

public class Profesor extends Empleado implements IDocente, ISpeaker {

    private List<Curso> cursosProfesor;

    public Profesor(Integer id_empleado, String nombre, String apellido) {
        super(id_empleado, nombre, apellido);
    }

    public List<Curso> getCursosProfesor() {
        return cursosProfesor;
    }

    public void setCursosProfesor(List<Curso> cursosProfesor) {
        this.cursosProfesor = cursosProfesor;
    }

    @Override
    public void calcularSueldo() {
        int horasTrabajadas = 0;
        for(Curso curso : cursosProfesor){
            horasTrabajadas += curso.getCantidadHoras();
        }
        this.setSueldo(horasTrabajadas * 1000);

    }

    @Override
    public void mostrarSueldo() {

        System.out.println("El sueldo del profesor es: " + this.getSueldo());
    }


    @Override
    public void trabajar() {
        System.out.println("******** El profe empieza a trabajar *********");
        System.out.println("El profesor prepara las clases");
        System.out.println("El profesor se conecta a las clases");
        System.out.println("El profesor contesta consultas");
        System.out.println("******** El profe termina de trabajar **********");
    }

    @Override
    public void darClases() {
        System.out.println("El profesor da clases en Coder");
    }

    @Override
    public void darConferencia() {
        System.out.println("El profesor habla en la coderConf");
    }
}
