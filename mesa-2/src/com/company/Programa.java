package com.company;

public class Programa {
    public static void main(String[] args) {
        UsuarioJuego jugador1 = new UsuarioJuego("Camada1", "ABC1234");
        System.out.println("El puntaje inicial de Camada1 es: " + jugador1.getPuntaje());
        jugador1.aumentarPuntaje();
        System.out.println("El nuevo puntaje de Camada1 es: " + jugador1.getPuntaje());
        jugador1.subirNivel();
        System.out.println("El nivel de Camada1 es: " + jugador1.getNivel());
        jugador1.bonus(10);
        System.out.println("El nuevo puntaje de Camada1 es: " + jugador1.getPuntaje());

    }
}
