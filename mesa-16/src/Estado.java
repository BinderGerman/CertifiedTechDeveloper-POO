public interface Estado {


    //Acciones
    void agragarProducto(Producto producto);
    void cancelarCarrito();
    void volverPuntoAnterior();
    void pasarSiguienteEstado();
}
