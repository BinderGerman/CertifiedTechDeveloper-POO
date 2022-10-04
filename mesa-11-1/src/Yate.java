public class Yate extends Embarcacion implements Comparable{
    private int cantCamarotes;

    public Yate(double precioBase, double valorAdicional, String anioFabricacion, double eslora, Capitan capitan, int cantCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yate yate2 = (Yate) o;
        int resp = 0;
        if(this.getCantCamarotes() > yate2.getCantCamarotes())
            resp = 1;
        if (this.getCantCamarotes() < yate2.getCantCamarotes())
            resp = -1;
        return resp;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }
}
