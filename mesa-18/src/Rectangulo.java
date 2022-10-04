public class Rectangulo implements Figura{
    private double altura;
    private double largo;

    //Constructor
    public Rectangulo(double altura, double largo) {
        this.altura = altura;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return altura * largo;
    }
}
