public abstract class Empleado {
    private String nombre;
    private String apellido;
    private int legajo;

    //Constructor
    public Empleado(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    //Método abstracto
    public abstract double calcularSueldo(int dias);

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }
}
