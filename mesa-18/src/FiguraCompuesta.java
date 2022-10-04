import java.awt.geom.Area;
import java.util.ArrayList;

public class FiguraCompuesta implements Figura{
    private String nombre;
    private ArrayList<Figura> figuras;

    //Constructor
    public FiguraCompuesta(String nombre) {
        this.nombre = nombre;
        figuras = new ArrayList<>();
    }

    // Métodos
    public void addFigura(Figura fig) {
        figuras.add(fig);
    }
    @Override
    public double calcularArea() {
        double AreaTotal = 0.0;
        for (Figura fig: figuras) {
            AreaTotal += fig.calcularArea();
        }
        return AreaTotal;
    }
}
