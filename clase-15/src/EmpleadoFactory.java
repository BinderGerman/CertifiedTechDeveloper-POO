public class EmpleadoFactory {
    private static EmpleadoFactory instance;

    private EmpleadoFactory() {

    }

    public static EmpleadoFactory getInstance(){
        if(instance == null)
            instance = new EmpleadoFactory();
        return instance;
    }

    public static Empleado crearEmpleado(String nombre, String apellido, int legajo, String codigo) throws Exception {
        return switch (codigo) {
            case "EMP-INT" -> new EmpleadoRelacionDependencia(nombre, apellido, legajo);
            case "EMP-EXT" -> new EmpleadoContratado(nombre, apellido, legajo);
            default -> throw new Exception();
        };
    }

}


