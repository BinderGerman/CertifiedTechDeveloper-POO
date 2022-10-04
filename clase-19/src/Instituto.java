import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private ArrayList<OfertaAcademica> ofertasAcademicas;

    //Constructor
    public Instituto(String nombre) {
        this.nombre = nombre;
        ofertasAcademicas = new ArrayList<>();
    }

    //Méodos
    public void generarInforme() {
        for (OfertaAcademica ofer: ofertasAcademicas) {
            System.out.println(ofer.getNombre() + "--->" + ofer.calcularPrecio());
        }
    }

    public void agregarOferta(OfertaAcademica oa) {
        ofertasAcademicas.add(oa);
    }

    //Getters y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
