public class Finalizado implements Estado{
    private Reparacion reparacion;

    //Constructor
    public Finalizado(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    //Métodos
    @Override
    public void darValorPresupuesto(double valor) {
        //No hace nada
    }

    @Override
    public void sumarRepuestos(double valor) {
        //No hace nada
    }

    @Override
    public void cambiarDireccion(String direccion) {
        //No hace nada
    }

    @Override
    public void pasarSiguientePaso() {

        reparacion.toString();
    }
}
