public class EmpleadoRelacionDependencia extends Empleado{
    private double sueldoMensual;


    //Constructor
    public EmpleadoRelacionDependencia(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
        sueldoMensual = 1000;
    }

    @Override
    public double calcularSueldo(int dias) {
        return sueldoMensual * dias / 30;
    }

    //Getter y Setter
    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }


}
