package CoderPOO;

import CoderPOO.clases.*;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        // Creamos los alumnos
        Alumno alu1 = new Alumno("Juan", "Perez", 17525);


/*        System.out.println(alu1.toString()); //qué esperan que se imprima? */

        // Creamos los profesores
        Profesor prof1 = new Profesor(155, "Pedro", "Ottaviano");

        // Creamos los tutores

        Tutor tut1 = new Tutor(895, "Joaquin", "Viretti");
        Tutor tut2 = new Tutor(896, "Vanesa", "Burman");

        // Creamos los cursos

        Curso curso1 = new Curso(25, 23000, "Java Inicial");
        Curso curso2 = new Curso(65, 12500, "React");
        Curso curso3 = new Curso(45, 12500, "Javascript");
        Curso curso4 = new Curso(20, 20000, "Scrum");

        //cursos de Vanesa
        List<Curso> cursosTutoriasVanesa = new ArrayList<>();
        cursosTutoriasVanesa.add(curso1);
        cursosTutoriasVanesa.add(curso2);

        List<Curso> cursosEstudianteVanesa = new ArrayList<>();
        cursosEstudianteVanesa.add(curso4);

        //cursos de Joaquin
        List<Curso> cursosTutoriasJoaquin = new ArrayList<>();
        cursosTutoriasJoaquin.add(curso1);
        cursosTutoriasJoaquin.add(curso3);

        List<Curso> cursosEstudianteJoaquin = new ArrayList<>();
        //Joaco ya se cursó todos los cursos

        //Cursos donde Pedro es profe
        List<Curso> cursosProfesorPedro = new ArrayList<>();
        cursosProfesorPedro.add(curso1);

        tut1.setCursosTutorias(cursosTutoriasVanesa);
        tut2.setCursosTutorias(cursosTutoriasJoaquin);


       tut1.setCursosComoEstudiante(cursosEstudianteVanesa);
/*

        tut1.calcularSueldo();
        tut1.mostrarSueldo();
        tut1.cobrarSueldo();*/


  /*      tut2.calcularSueldo();
        tut2.mostrarSueldo();
        tut2.cobrarSueldo();


*/

/*

        try {
            tut2.calcularSueldo();
        } catch (NullPointerException ex) {
            System.out.println("No se puede calcular el sueldo, error " + ex.getMessage());
        }

        alu1.estudiar();*/


       /* prof1.setCursosProfesor(cursosProfesorPedro);

        prof1.calcularSueldo();
        prof1.mostrarSueldo();
        prof1.cobrarSueldo();
        prof1.darClases();
        prof1.darConferencia();
*/
       /*

        Empleado prof2 = new Empleado();
        // Empleado prof2 = new Profesor (254, "Maria", "Lopez");
        // prof2.trabajar();
        // prof2.darClases();
*/


        CoderTeam coderTeam = new CoderTeam();
        //el constructor de CoderTeam genera una lista de empleados
        coderTeam.addEmpleado(prof1);
        coderTeam.addEmpleado(tut1);
        coderTeam.addEmpleado(tut2);

        for(Empleado empleado : coderTeam.getEmpleados()){
            empleado.trabajar();
        }


    }
}
