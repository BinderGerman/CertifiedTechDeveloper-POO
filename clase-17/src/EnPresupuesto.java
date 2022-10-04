public class EnPresupuesto implements Estado {
    private Reparacion reparacion;

    //Constructor
    public EnPresupuesto(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    //Métodos
    @Override
    public void darValorPresupuesto(double valor) {
        reparacion.setPresupuesto(valor);
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
        reparacion.setEstado(new EnReparacion(reparacion));
        System.out.println(reparacion.toString());
    }
}
