import java.util.Date;

public abstract class Impresora {
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;



    // Métodos
    public boolean tienePapel() {
        if (hojasDisponibles > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean necesitaTinta() {
        return porcentajeTinta <= 5;
    }

    public abstract String imprimir();
}
