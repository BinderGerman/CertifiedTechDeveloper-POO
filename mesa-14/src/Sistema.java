import java.util.ArrayList;

public class Sistema {
    private String nombre;
    private ArrayList<Reserva> reservas;

    //Constructor
    public Sistema(String nombre) {
        this.nombre = nombre;
        reservas = new ArrayList<>();
    }

    //Método para agregar reservas a la Colección.
    //Se crean en el Main y se agregan al sistema con este método.
    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    //Método para calcular la suma total de las reservas.
    //Recorre la colección y va sumando el resultado de cada método
    //calcularReserva() a una variable interna: "sumaTotal".
    public double recaudacionTotal() {
        double sumaTotal = 0.0;
        for (Reserva res: reservas) {
            sumaTotal += res.calcularReserva();
        }
        return sumaTotal;
    }

    //Método para contar la cantidad de personas que pasarán por una estación,
    //ya sea una estación de llegada o de partida. Se recorre la colección de reservas y: si
    //la estación pasada por parámetro concuerda con una estación de partida o de llegada se
    //suman las personas de esa reserva al contador final. Si la estación no corresponde se lanza la excepción.
    public int cantVecesRecorrida(String estacion) throws Exception {
        int personasXEstacion = 0;
        for (Reserva res: reservas) {
            if (!estacion.equals(res.getEstacionPartida()) && !estacion.equals(res.getEstacionDestino())) {
                throw new Exception("Error: Estación incorrecta");
            } else {
                personasXEstacion += res.getCantPasajeros();
            }
        }
        return personasXEstacion;
    }


}
