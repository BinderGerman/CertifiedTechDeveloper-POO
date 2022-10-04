public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto("Buenos Aires");


        Contenedor con1 = new Contenedor(125, "Brasil", true );
        Contenedor con2 = new Contenedor(128, "DESCONOCIDO", true );
        Contenedor con3 = new Contenedor(117, "Brasil", false );

        // Agregar
        puerto.addContenedor(con1);
        puerto.addContenedor(con2);
        puerto.addContenedor(con3);

        //Mostrar
        System.out.println("Mostrar contenedores:");
        puerto.listarContenedores();

        //Listar contenedor peligroso y desconocido
        System.out.println("Mostrar contenedores desconocidos y peligrosos: " + puerto.contenedoresPeligrosos());

    }
}
