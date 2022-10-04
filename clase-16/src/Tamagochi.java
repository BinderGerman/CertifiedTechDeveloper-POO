public class Tamagochi {
    private Estado estado;

    //Constructor
    public Tamagochi() {
        estado = new Triste(this);

    }

    //Acciones
    public void beber() {
        estado.beber();
    }

    public void comer() {
        estado.comer();

    }

    public void recibirMimos() {
        estado.recibirMimos();
    }

    // Getters y Setters
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
