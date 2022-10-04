package presencial;

import java.util.Date;

public abstract class Impresora {
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;

    @Override
    public String toString(){
        return "Hojas disponibles: "+hojasDisponibles;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public void setPorcentajeTinta(double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    public boolean tienePapel(){
        if (hojasDisponibles>0){
            return true;
        }
        else
            return false;
    }

    public boolean necesitaTinta(){
        return porcentajeTinta<=5;
    }

    public abstract String imprimir();

}
