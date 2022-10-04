public class EstadoFactory {
    private static EstadoFactory instance;

    private EstadoFactory() {

    }

    //Singleton
    public static EstadoFactory getInstance() {
        if(instance == null)
            instance = new EstadoFactory();
        return instance;
    }

    //Método creador de Estados
    public static Estado crearEstado(String tipo, Reparacion reparacion) throws Exception {
        return switch (tipo) {
            case "EnPresupuesto" -> new EnPresupuesto(reparacion);
            case "EnReparacion" -> new EnReparacion(reparacion);
            case "ParaEnvio" -> new ParaEnvio(reparacion);
            case "Finalizado" -> new Finalizado(reparacion);
            default -> throw new Exception();
        };
    }
}
