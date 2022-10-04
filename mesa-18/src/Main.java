public class Main {
    public static void main(String[] args) {
        FiguraCompuesta locomotora = new FiguraCompuesta("Locomotora");
        locomotora.addFigura(new Circulo(11));
        locomotora.addFigura(new Circulo(11));
        locomotora.addFigura(new Triangulo(10, 6));
        locomotora.addFigura(new Rectangulo(5, 10));
        locomotora.addFigura(new Rectangulo(3, 5));
        locomotora.addFigura(new Rectangulo(1, 2));
        System.out.println("El área total de la Locomotora es: " + locomotora.calcularArea());

        FiguraCompuesta vagon = new FiguraCompuesta("Vagon");
        vagon.addFigura(new Circulo(11));
        vagon.addFigura(new Circulo(11));
        vagon.addFigura(new Circulo(11));
        vagon.addFigura(new Rectangulo(5, 10));
        System.out.println("El área total del vagon es: " + vagon.calcularArea());

        FiguraCompuesta tren = new FiguraCompuesta("Tren");
        tren.addFigura(locomotora);
        tren.addFigura(vagon);
        tren.addFigura(vagon);
        System.out.println("El área total del tren es de: " + tren.calcularArea());

    }
}
