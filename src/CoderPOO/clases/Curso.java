package CoderPOO.clases;

public class Curso {
    private int cantidadHoras;
    private int valorDelCurso;
    private String nombreCurso;

    public Curso(int cantidadHoras, int valorDelCurso, String nombreCurso){
        this.cantidadHoras = cantidadHoras;
        this.valorDelCurso = valorDelCurso;
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHoras(){
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras){
        this.cantidadHoras = cantidadHoras;
    }

    public int getValorDelCurso() {
        return valorDelCurso;
    }

    public void setValorDelCurso(int valorDelCurso) {
        this.valorDelCurso = valorDelCurso;
    }
}
