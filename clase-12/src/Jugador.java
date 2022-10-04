public class Jugador implements Comparable<Jugador> {
    private int nroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean esTitular;

    //Constructor
    public Jugador(int nroCamiseta, String nombre, boolean lesionado, boolean esTitular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.esTitular = esTitular;
    }

    public boolean getLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean getEsTitular() {
        return esTitular;
    }

    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }

    @Override
    public int compareTo(Jugador o) {
        int resp = 0;
        if (nroCamiseta < o.nroCamiseta)
            resp = 1;
        if (nroCamiseta > o.nroCamiseta)
            resp = -1;
        return resp;
    }
}
