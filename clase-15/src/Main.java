public class Main {
    public static void main(String[] args) {
        Empresa coca = new Empresa("Coca-Cola");
        try {
            coca.addEmpleado("Carla", "Antonini",1010, "EMP-INT");
            coca.addEmpleado("Eugenia", "Guatelli", 2020, "EMP-EXT");
        } catch (Exception excepcion) {
            System.err.println(excepcion);
        }

    }

}
