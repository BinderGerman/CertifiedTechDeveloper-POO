import java.util.ArrayList;

public class Combo extends Item{
    private double descuento;
    private ArrayList<Item> items;

    //Constructor

    public Combo(String nombre, double descuento) {
        super(nombre);
        this.descuento = descuento;
        items = new ArrayList<>();
    }

    //Métodos
    public void agregarItem(Item i) {
        items.add(i);
    }
    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        for (Item unItem: items) {
            precioTotal += unItem.calcularPrecio();
        }
        return precioTotal - precioTotal * descuento;
    }

    @Override
    public String mostrar() {
        String elTexto = getNombre() + "--->" + "Precio del combo: " + calcularPrecio() + "\n";
        elTexto = elTexto.concat("--------\n");
        for (Item unItem: items) {
            elTexto = elTexto.concat(unItem.mostrar());
        }
        elTexto = elTexto.concat("--------\n");
        return elTexto;
    }
}
