public class Cerrado implements Estado {
    private Carrito carrito;

    //Constructor
    public Cerrado(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("Creando estado Cerrado");
    }

    //Acciones
    @Override
    public void agragarProducto(Producto producto){
        System.out.println("Para cargar productos debe pasar al Estado Cargando");
    }
    @Override
    public void cancelarCarrito(){
        carrito.setEstado(new Vacio(carrito));
    }
    @Override
    public void volverPuntoAnterior(){
        carrito.setEstado(new Pagando(carrito));
    }
    @Override
    public void pasarSiguienteEstado(){
        carrito.setEstado(new Vacio(carrito));
    }
}
