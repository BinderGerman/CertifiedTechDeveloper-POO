package mesas;

public class Objeto {
    private int posx;
    private int posy;
    private char direccion;

    public char getDireccion() {
        return direccion;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public Objeto(int x, int y, char direccion) {
        posx = posx;
        posy = posy;
        this.direccion = direccion;
    }

    public void irA(int x, int y, char direccion){
        System.out.println("Viajando a ("+x+","+y+")");
        posx=x;
        posy=y;
        this.direccion=direccion;
    }
}
