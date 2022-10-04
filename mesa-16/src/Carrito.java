import java.util.ArrayList;

public class Carrito {
    private Estado estado;
    private ArrayList<Producto> productos;

    //Constructor
    public Carrito() {
        this.estado = new Vacio(this);
        productos = new ArrayList<>();
    }

    //Acciones
    public void agragarProducto(Producto producto){
        estado.agragarProducto(producto);
    }
    public void cancelarCarrito(){
        estado.cancelarCarrito();
    }
    public void volverPuntoAnterior(){
        estado.volverPuntoAnterior();
    }
    public void pasarSiguienteEstado(){
        estado.pasarSiguienteEstado();
    }

    //Getters y Setters

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
