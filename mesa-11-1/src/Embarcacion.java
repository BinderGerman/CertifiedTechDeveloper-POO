public abstract class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private String anioFabricacion;
    private double eslora;
    private Capitan capitan;

    public Embarcacion(double precioBase, double valorAdicional, String anioFabricacion, double eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }

    public double calcularMonto(precioBase double) {
        return 1;
    }
}
