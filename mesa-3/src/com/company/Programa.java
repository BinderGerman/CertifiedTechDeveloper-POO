package com.company;

public class Programa {
    public static void main(String[] args) {
        // Can1 no reúne las condiciones para ser adoptado pero tiene chip
        Perro can1 = new Perro("Firulais", "Callejero", 6.6, true, true);
        can1.sePuedeAdpotar();
        can1.sePuedePerder();

        //Perro2 reúne las condiciones para su adopción, no tiene chip y se puede calcular sus años aproximados
        Perro can2 = new Perro("Huesos", "Callejero", 5.6, 2019, false, false );
        can2.sePuedeAdpotar();
        can2.sePuedePerder();
        System.out.println("la edad estimada de " + can2.getNombre() + " es " + can2.calcularEdad() + " años");
    }
}
