public class Hambriento implements Estado{
    private Tamagochi tamagochi;

    //Constructor
    public Hambriento (Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
        System.out.println("Creando estado Hambriento");
    }

    //Acciones
    @Override
    public void beber() {
        //Sin cambios

    }

    @Override
    public void comer() {
        tamagochi.setEstado(new Feliz(tamagochi));

    }

    @Override
    public void recibirMimos() {
        //Sin cambios

    }
}
