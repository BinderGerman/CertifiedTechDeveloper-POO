import java.util.ArrayList;

public class Equipo {
    private String nombre;
    //Colección
    private ArrayList<Jugador> equipo;

    //Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        equipo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    public void addJuagdor(Jugador j) {
        equipo.add(j);

    }

    public void mostrarJugadoresTitulares() {
        equipo.sort(null);
        for (Jugador jug: equipo) {
            if (jug.getEsTitular())
                System.out.println(jug);
        }
    }

    public int getCantidadDeJuagadoresLesionados() {
        int cant = 0;
        for (Jugador jug: equipo) {
            if (jug.getEsTitular() && jug.getLesionado())
                cant ++;
        }
        return cant;
    }
}
