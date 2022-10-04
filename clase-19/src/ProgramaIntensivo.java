import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica {
    private double porcentajeBonificacion;
    private ArrayList<OfertaAcademica> ofertas;

    //Constructor
    /*Hacemos un constructor solo para dar espacio en memoria a la Collection*/
    public ProgramaIntensivo() {
        ofertas = new ArrayList<>();
    }

    //Métodos
    public void agregarOferta(OfertaAcademica oa) {
        ofertas.add(oa);
    }

    @Override
    public double calcularPrecio() {
        double total = 0.0;
        for (OfertaAcademica oa: ofertas) {
            total += oa.calcularPrecio();
        }
        return total - (total * porcentajeBonificacion);
    }

    //Getters y Setters
    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }
}
