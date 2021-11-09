package CoderPOO.clases;

import CoderPOO.interfaces.ITrabajador;

public abstract class Empleado implements ITrabajador {
    //atributos
    Integer id_empleado;
    String nombre;
    String apellido;
    private double sueldo;

    //Constructor. No lo vamos a usar para instanciar porque es una clase abstracta. Solo le vamos a
    //decir que tiene una implementacion en las clases hijas, que lo llaman a través de super()
    public Empleado(Integer id_empleado, String nombre, String apellido) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //los métodos de ITrabajador...
    @Override
    public abstract void calcularSueldo();

    @Override
    public abstract void mostrarSueldo();

    @Override
    public void cobrarSueldo(){
        System.out.println("El empleado cobró el sueldo y está feliz");
    }

    @Override
    public abstract void trabajar();

    //los getter y setters (para acceder a los atributos)

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


}
