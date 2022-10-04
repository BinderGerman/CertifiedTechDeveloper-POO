public class EmpleadoContratado extends Empleado{
    private double importePorHora;
    private double retencionImpuesto;


    //Constructor
    public EmpleadoContratado(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
        importePorHora = 7;
        retencionImpuesto = 0.14;
    }

    //Acciones
    @Override
    public double calcularSueldo(int dias) {
        final int HORAS_X_DIA = 8;
        return HORAS_X_DIA * this.importePorHora * (1 - this.retencionImpuesto);
    }


    //Getters y Setter
    public double getImportePorHora() {
        return importePorHora;
    }

    public void setImportePorHora(double importePorHora) {
        this.importePorHora = importePorHora;
    }

    public double getRetencionImpuesto() {
        return retencionImpuesto;
    }

    public void setRetencionImpuesto(double retencionImpuesto) {
        this.retencionImpuesto = retencionImpuesto;
    }
}
