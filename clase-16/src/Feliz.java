public class Feliz implements Estado{
    private Tamagochi tamagochi;

    //Constructor
    public Feliz (Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
        System.out.println("Creando estado Feliz");
    }

    //Acciones
    @Override
    public void beber() {
        System.out.println("Beep, Beep, Beep, Beep, Beep");
    }

    @Override
    public void comer() {
        //Sin cambios

    }

    @Override
    public void recibirMimos() {
        //Sin cambios
    }
}
