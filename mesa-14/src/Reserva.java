
public class Reserva {
    private int codigoReserva;
    private String estacionPartida;
    private String estacionDestino;
    private int cantPasajeros;


    //Constructor
    public Reserva(int codigoReserva, String estacionPartida, String estacionDestino, int cantPasajeros) {
        this.codigoReserva = codigoReserva;
        this.estacionPartida = estacionPartida;
        this.estacionDestino = estacionDestino;
        this.cantPasajeros = cantPasajeros;
    }

    //Método auxiliar para usar en calcularReserva() y saber si
    //es un viaje de punta a punta y si corresponde descuento
    public boolean esViajeCompleto() {
        return (estacionPartida.equals("Buenos Aires") && estacionDestino.equals("Bragado")) ||
                (estacionPartida.equals("Bragado") && estacionDestino.equals("Buenos Aires"));
    }

    //Calcula el total de una reserva teniendo en cuenta la cantidad
    //de pasajeros y multiplicando por el valor del boleto
    public double calcularReserva() {
        double valorViaje = cantPasajeros * 50;
        if (esViajeCompleto()) {
            valorViaje -= valorViaje * 0.2;
        }
       return valorViaje;
    }

    //Getters para usar en el método cantVecesRecorrida() de la clase Sistema
    public String getEstacionPartida() {
        return estacionPartida;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }
}
