package presencial;

public class Programa {
    public static void main(String[] args) {
        Socio s1= new Socio("A001","Rodolfo",250.5,"Gym");
        SocioHabilitado s2= new SocioHabilitado("A002","Ezequiel",300.50,"Pesas",150.5);

        System.out.println("Cuota de s1 "+s1.costoMensual());
        System.out.println("Cuota de s2 "+s2.costoMensual());
        s2.setHabilitado(true);
        System.out.println("Cuota de s2 "+s2.costoMensual());

        System.out.println(s2.toString());

        System.out.println(s2.hashCode());
        System.out.println(s2.equals(s1));
    }
}
