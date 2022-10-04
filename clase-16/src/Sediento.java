public class Sediento implements Estado{
    private Tamagochi tamagochi;

    //Constructor
    public Sediento (Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
        System.out.println("Creando estado Sediento");
    }

    //Acciones
    @Override
    public void beber() {
        tamagochi.setEstado(new Feliz(tamagochi));
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
