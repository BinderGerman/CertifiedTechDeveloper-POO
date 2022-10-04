package com.company;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private int puntaje;
    private int nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        puntaje = 0;
        nivel = 0;
    }

   // Métodos
   public void aumentarPuntaje() {
        puntaje += 1;
   }

   public void subirNivel() {
        nivel += 1;
   }

   public void bonus(int valor) {
        puntaje += valor;
   }

    //Getter


    public int getPuntaje() {
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }

}
