public class Producto extends Item{
    private double precio;

    //Constructor
    public Producto(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }

    //Métodos
    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public String mostrar() {
        return getNombre() + "--->" + calcularPrecio() + "\n" ;
    }



}
