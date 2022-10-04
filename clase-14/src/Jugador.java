public class Jugador {
    private String apellido;
    private int nroCamiseta;
    private String posicion;

    public Jugador(String apellido, int nroCamiseta, String posicion) {
        this.apellido = apellido;
        this.nroCamiseta = nroCamiseta;
        this.posicion = posicion;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }
}
