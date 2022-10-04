public abstract class Item {
    private String nombre;

    //Constructor
    public Item(String nombre) {
        this.nombre = nombre;
    }

    //Getter
    public String getNombre() {
        return nombre;
    }

    //Métodos
    public abstract double calcularPrecio();

    public abstract String mostrar();
}
