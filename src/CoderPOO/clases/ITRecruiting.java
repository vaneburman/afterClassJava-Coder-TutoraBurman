package CoderPOO.clases;

public class ITRecruiting extends Empleado {

    private int cantidadDeContratados;


    public ITRecruiting(Integer id_empleado, String nombre, String apellido) {
        super(id_empleado, nombre, apellido);
    }

    public void setCantidadDeContratados(int cantidadDeContratados) {
        this.cantidadDeContratados = cantidadDeContratados;
    }

    public int getCantidadDeContratados() {
        return cantidadDeContratados;
    }

    @Override
    public void calcularSueldo() {
        this.setSueldo(getCantidadDeContratados() * 100);
    }

    @Override
    public void mostrarSueldo() {
        System.out.println("El sueldo de este empleado de RRHH es: " + this.getSueldo());
    }


    @Override
    public void trabajar() {
        System.out.println("El empleado de RRHH contrata empleados de Coder");
        System.out.println("El empleado de RRHH informa las liquidaciones de sueldo");
        System.out.println("El empleado de RRHH evalúa entrevistas");
    }
}
