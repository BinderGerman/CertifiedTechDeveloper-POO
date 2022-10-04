public class Triangulo implements Figura{
    private double altura;
    private double base;

    //Constructor
    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }
}
