public class Velero extends Embarcacion{
    private int cantMastiles;

    public Velero(double precioBase, double valorAdicional, String anioFabricacion, double eslora, Capitan capitan, int cantMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantMastiles = cantMastiles;
    }

    public boolean esGrande() {
        int
        if (getCantMastiles() > 4) {
            return true;
        }

    }

    public int getCantMastiles() {
        return cantMastiles;
    }
}
