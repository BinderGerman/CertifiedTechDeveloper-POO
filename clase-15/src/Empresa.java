import java.util.ArrayList;

public class Empresa {
    private String razonSocial;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();
    }

    public double calcularSueldoTotal(int dias) {
        double total = 0;
        for (Empleado emp: empleados) {
            total += emp.calcularSueldo(dias);
        }
        return total;
    }

    public void addEmpleado(String nombre, String apellido, int legajo, String codigo) throws Exception {
        Empleado nuevoEmpleado = EmpleadoFactory.crearEmpleado(nombre, apellido, legajo, codigo);
        this.empleados.add(nuevoEmpleado);
    }
}
