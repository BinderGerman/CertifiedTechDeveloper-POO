public class Caja extends Producto {
    private double longitud;
    private double ancho;
    private double altura;

    //Constructor
    public Caja(double peso) {
        super(peso);
        this.longitud = 10;
        this.ancho = 10;
        this.altura = 10;
    }

    @Override
    public double calcularEspacio() {
        return longitud * ancho * altura;
    }
}
