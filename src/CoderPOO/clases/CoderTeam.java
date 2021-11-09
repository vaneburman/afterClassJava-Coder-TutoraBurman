package CoderPOO.clases;

import java.util.*;

public class CoderTeam {
    List<Empleado> empleados;

    public CoderTeam(){
        this.empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
