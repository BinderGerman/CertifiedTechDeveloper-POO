import java.util.ArrayList;

public class Almacen {
    private ArrayList<Producto> productos;

    // Constructor
    public Almacen() {
        productos = new ArrayList<>();
    }

    public void addProducto(String codigo) throws Exception {
        Producto nuevoProducto = ProductoFactory.crearProducto(codigo);
        productos.add(nuevoProducto);
    }

    public double calcularEspacioTotal() {
        double espacioTotal = 0.0;
        for (Producto pdto: productos) {
            espacioTotal += pdto.calcularEspacio();
        }
        return espacioTotal;
    }
}
