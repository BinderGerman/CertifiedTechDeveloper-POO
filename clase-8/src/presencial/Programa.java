package presencial;

public class Programa {
    public static void main(String[] args) {
        ImpresoraCannon can= new ImpresoraCannon();
        can.setHojasDisponibles(50);
        can.setPorcentajeTinta(50);
        System.out.println(can);
        System.out.println(can.imprimir());
        System.out.println(can);

        ImpresoraEpson eps= new ImpresoraEpson();
        System.out.println(eps.imprimir());

        Impresora imp=new ImpresoraEpson();
        System.out.println(imp.imprimir());
    }
}
