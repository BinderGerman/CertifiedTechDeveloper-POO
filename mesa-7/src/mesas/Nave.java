package mesas;

public class Nave extends Objeto{
    private double velocidad;
    private int vida;

    public Nave(int x, int y, char direccion, double velocidad) {
        super(x, y, direccion);
        this.velocidad = velocidad;
    }

    @Override
    public void irA(int x, int y, char direccion){
        if (direccion!=getDireccion()){
           girar(direccion);
        }
        setPosx(x);
        setPosy(y);
    }

    public void girar(char direccion){
        setDireccion(direccion);
    }

    public void restarVida(int valor){
        if (vida-valor<0){
            vida=0;
        }
        else{
            vida-=valor;
        }
    }
}
