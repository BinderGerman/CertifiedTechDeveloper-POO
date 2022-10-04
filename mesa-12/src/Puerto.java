import java.util.ArrayList;

public class Puerto {
    private String nombre;
    private ArrayList<Contenedor> contenedores;

    //Constructor
    public Puerto(String nombre) {
        this.nombre = nombre;
        contenedores = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Contenedor> getContenedores() {
        return contenedores;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContenedores(ArrayList<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }

    public void addContenedor(Contenedor con) {
        contenedores.add(con);
    }

    public void listarContenedores() {
        contenedores.sort(null);
        for (Contenedor con: contenedores) {
            System.out.println(con);
        }
    }

    public int contenedoresPeligrosos() {
        int cant = 0;
        for (Contenedor con: contenedores) {
            if (con.isEsPeligroso() && con.getProcedencia().equals("DESCONOCIDO")) {
               cant ++;
            }
        }
        return cant;
    }


}
