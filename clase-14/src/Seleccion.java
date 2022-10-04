import java.util.ArrayList;

public class Seleccion {
    private String nombre;
    private ArrayList<Jugador> plantel;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        plantel = new ArrayList<>();
    }

    public void addJuagador(Jugador jugador) {
        plantel.add(jugador);
    }

    // Método obtener reservas
    public int cantJugadores(String posicion) throws Exception {
        int resp = 0;
        if(posicion.equals("ARQUERO") || posicion.equals("MEDIOCAMPISTA") || posicion.equals("DEFENSOR") || posicion.equals("DELANTERP") ) {
            for (Jugador jug: plantel) {
                if(jug.getPosicion().equals(posicion)) {
                    resp ++;
                }
            }
        } else {
            throw new Exception("la posición ingresada no es correcta");
        }
        return resp;
    }
}
