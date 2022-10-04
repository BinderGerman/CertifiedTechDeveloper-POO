import java.lang.Math;

public class Circulo implements Figura{
    private double radio;

    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        final double PI = Math.PI;
        return radio * radio * PI;
    }
}
