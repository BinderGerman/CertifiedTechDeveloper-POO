public class Reparacion {
    private Estado estado;
    private String articulo;
    private double presupuesto;
    private String direccion;

    //Constructor
    public Reparacion(String articulo, String direccion) {
        estado = new EnPresupuesto(this);
        this.articulo = articulo;
        presupuesto = 0.0;
        this.direccion = direccion;
    }

    //Métodos
    public void presupuestar(double valor) {
        estado.darValorPresupuesto(valor);
    }
    public void presupuestarRepuestos(double valor) {
        estado.sumarRepuestos(valor);
    }
    public void modificarDireccion(String direccion) {
        estado.cambiarDireccion(direccion);
    }
    public void siguientePaso() {
        estado.pasarSiguientePaso();
    }

    //Método toString para mostrar cada vez que pasa de Estado
    public String toString() {
        return "Nombre del producto: " + getArticulo() + "\n"
                + "Estado del Presupuesto: " + getPresupuesto() + "\n"
                + "Dirección de envío: " + getDireccion();
    }

    //Getters
    public Estado getEstado() {
        return estado;
    }

    public String getArticulo() {
        return articulo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public String getDireccion() {
        return direccion;
    }

    //Setters
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
