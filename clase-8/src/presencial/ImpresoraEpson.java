package presencial;

public class ImpresoraEpson extends Impresora {
    @Override
    public String imprimir() {
        if (tienePapel()&&!necesitaTinta()){
            return "Imprimiendo con la Epson";
        }
        else{
            return "Revisar Epson";
        }

    }
}
