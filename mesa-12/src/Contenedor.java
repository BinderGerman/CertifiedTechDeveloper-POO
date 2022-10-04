public class Contenedor implements Comparable<Contenedor> {
    private int numero;
    private String procedencia;
    private boolean esPeligroso;

    // Constructor
    public Contenedor(int numero, String procedencia, boolean esPeligroso) {
        this.numero = numero;
        this.procedencia = procedencia;
        this.esPeligroso = esPeligroso;
    }

    //Getters
    public int getNumero() {
        return numero;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public boolean isEsPeligroso() {
        return esPeligroso;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public void setEsPeligroso(boolean esPeligroso) {
        this.esPeligroso = esPeligroso;
    }

    // toString
    @Override
    public String toString() {
        return "numero de contenedor: " + numero + " Procedencia: " + procedencia;
    }


    @Override
    public int compareTo(Contenedor cont) {
        int resp = 0;
        if (numero > cont.getNumero() )
            resp = 1;
        if (numero < cont.getNumero())
            resp = -1;
        return resp;
    }


}
