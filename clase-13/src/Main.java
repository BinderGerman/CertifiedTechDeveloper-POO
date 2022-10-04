public class Main {
    public static void main(String[] args) {
        Cliente rodolfo = new Cliente("Rodolfo", "Baspineiro", "1234", 1000);

        try{
            rodolfo.comprar(500);
        }
        catch (ClienteException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(rodolfo);


    }
}
