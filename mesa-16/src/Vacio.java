public class Vacio  implements Estado{
    private Carrito carrito;

    //Constructor
    public Vacio(Carrito carrito) {
        this.carrito = carrito;
        carrito.getProductos().clear();
        System.out.println("Creando estado Vacio");
    }

    //Acciones
    @Override
    public void agragarProducto(Producto producto){
        System.out.println("El carrito está en Estado Vacío debe pasar al Estado Cargando para poder cargar Productos");

    }
    @Override
    public void cancelarCarrito(){
        System.out.println("Sin cambios. El carrito ya está Vacío");

    }
    @Override
    public void volverPuntoAnterior(){
        System.out.println("Sin cambios no hay Estado anterior a Vacio");


    }
    @Override
    public void pasarSiguienteEstado(){
        carrito.setEstado(new Cargando(carrito));


    }
}
