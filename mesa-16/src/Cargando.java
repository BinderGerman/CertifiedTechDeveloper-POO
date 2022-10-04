import java.util.ArrayList;

public class Cargando implements Estado {
    private Carrito carrito;


    //Constructor
    public Cargando(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("Creando estado Cargando");
    }


    //Acciones
    @Override
    public void agragarProducto(Producto producto){
        carrito.getProductos().add(producto);
    }

    @Override
    public void cancelarCarrito(){
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void volverPuntoAnterior(){
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void pasarSiguienteEstado(){
        carrito.setEstado(new Pagando(carrito));
    }

}
