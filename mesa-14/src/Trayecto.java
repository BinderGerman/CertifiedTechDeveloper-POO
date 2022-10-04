import java.util.ArrayList;


public class Trayecto {
    private ArrayList<String> estaciones;

    public Trayecto() {
        estaciones = new ArrayList<>();
        estaciones.add("Buenos Aires");
        estaciones.add("Lujan");
        estaciones.add("Mercedez");
        estaciones.add("Suipacha");
        estaciones.add("Chivilcoy");
        estaciones.add("Alberti");
        estaciones.add("Bragado");
    }

    //Método para agregar más estaciones pide una posición en la lista y un nombre de estación.
    public void addEstaciones(int indice, String nuevaEstacion) {
        estaciones.add(indice, nuevaEstacion);
    }

    public String getEstacion(int indice) {
       return estaciones.get(indice);
    }

    public ArrayList<String> getEstaciones() {
        return estaciones;
    }
}
