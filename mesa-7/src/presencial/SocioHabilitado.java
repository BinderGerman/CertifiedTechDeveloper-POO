package presencial;

public class SocioHabilitado extends Socio{
    private Double costoPileta;
    private boolean habilitado;
    @Override
    public boolean equals(Object o){
        if (o==null)
            return false;
        if (!(o instanceof SocioHabilitado))
            return false;
        else{
            if (getNumeroSocio().equals(((SocioHabilitado) o).getNumeroSocio()))
                return true;
            else
                return false;
        }
    }
    @Override
    public int hashCode(){
        int valor=7;
        valor=valor*getCostoPileta().hashCode();
        return valor;
    }
    @Override
    public String toString(){
        return getNumeroSocio()+"-"+getNombre();
    }

    @Override
    public Double costoMensual(){
        if (habilitado){
            return getCuotaMensual()+costoPileta;
        }
        else{
            return getCuotaMensual();
        }
    }

    public SocioHabilitado(String numero, String nombre, Double cuota, String actividad, Double costoPileta) {
        super(numero, nombre, cuota, actividad);
        this.costoPileta = costoPileta;
    }

    public Double getCostoPileta() {
        return costoPileta;
    }

    public void setCostoPileta(Double costoPileta) {
        this.costoPileta = costoPileta;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
