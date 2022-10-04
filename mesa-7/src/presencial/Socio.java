package presencial;

public class Socio {
    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Double costoMensual(){
        // se posibilita el agregado de mas cosas
        return cuotaMensual;
    }

    public Socio(String numero, String nombre, Double cuota, String actividad) {
        this.numeroSocio = numero;
        this.nombre = nombre;
        this.cuotaMensual = cuota;
        this.actividad = actividad;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }

    public String getActividad() {
        return actividad;
    }


}
