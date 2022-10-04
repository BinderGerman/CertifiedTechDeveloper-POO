public class EnReparacion implements Estado{
    private Reparacion reparacion;

    //Constructor
    public EnReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    //Métodos
    @Override
    public void darValorPresupuesto(double valor) {
        //No hace nada
    }

    @Override
    public void sumarRepuestos(double valor) {
        double sumarRepuesto = reparacion.getPresupuesto() + valor;
        reparacion.setPresupuesto(sumarRepuesto);
    }

    @Override
    public void cambiarDireccion(String direccion) {
        //No hace nada
    }

    @Override
    public void pasarSiguientePaso() {
        reparacion.setEstado(new ParaEnvio(reparacion));
        System.out.println(reparacion.toString());
    }
}
