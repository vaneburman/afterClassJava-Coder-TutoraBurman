package EjemploClaseAbstracta;

import java.util.StringJoiner;

public abstract class FiguraGeometrica {

    protected String tipoFigura;

    public abstract void dibujar();

    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", FiguraGeometrica.class.getSimpleName() + "[", "]")
                .add("tipoFigura='" + tipoFigura + "'")
                .toString();
    }
}