public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        try {
            almacen.addProducto("CAJA10X10");
            almacen.addProducto("PELOTAFUTBOL");
            almacen.addProducto("PELOTATENIS");
        }
        catch (Exception e) {
            System.err.println("e");
        }

        System.out.println("El espacio total ocupado por los productos es de: " + almacen.calcularEspacioTotal() + "cm2");



    }

}
