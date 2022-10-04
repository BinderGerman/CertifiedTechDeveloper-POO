public class ParaEnvio implements Estado{
    private Reparacion reparacion;

    //Constructor
    public ParaEnvio(Reparacion reparacion) {
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
        reparacion.setDireccion(direccion);
    }

    @Override
    public void pasarSiguientePaso() {
        reparacion.setEstado(new Finalizado(reparacion));
        System.out.println(reparacion.toString());
    }
}
