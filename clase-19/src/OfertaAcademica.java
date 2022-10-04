public abstract class OfertaAcademica {
    private String nombre;
    private String descripcion;

    //Constructor
    /*No hacemos constructor porque vamoa a crrar las clases desde el Factory*/

    //Método abstracto
    public abstract double calcularPrecio();

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
