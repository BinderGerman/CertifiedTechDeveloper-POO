public class Pagando implements Estado{
    private Carrito carrito;

    public Pagando(Carrito carrito) {
        this.carrito = carrito;
        System.out.println("Creando estado Pagando");
    }

    //Acciones
    @Override
    public void agragarProducto(Producto producto){
        System.out.println("Para cargar productos debe retroceder al Estado Cargando");

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
        carrito.setEstado(new Cerrado(carrito));
    }
}
