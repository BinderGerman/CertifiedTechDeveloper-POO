package presencial;

public class ImpresoraCannon extends Impresora{
    @Override
    public String imprimir() {
        if (tienePapel()&&!necesitaTinta()){
            return "Imprimiendo con la Cannon";
        }
        else{
            return "Revisar Cannon";
        }
    }

    @Override
    public boolean necesitaTinta(){
        return getPorcentajeTinta()<=20;
    }
}
