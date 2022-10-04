public class Triste implements Estado{
    private Tamagochi tamagochi;

    //Constructor
    public Triste (Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
        System.out.println("Creando estado Triste");
    }

    //Acciones
    @Override
    public void beber() {
        System.out.println("Beep, Beep, Beep, Display titilando");
    }

    @Override
    public void comer() {
        System.out.println("Beep, Beep");

    }

    @Override
    public void recibirMimos() {
        tamagochi.setEstado(new Feliz(tamagochi));

    }
}
