package com.company.practica1;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("German", "Binder", 1234);
        Alumno alumno2 = new Alumno("Matias", "Bejas", 5678);

        ExamenParcial primerExamen = new ExamenParcial(alumno1, "POO", "Primer Examen", 5, 2);
        System.out.println(primerExamen.estaAprobado());
        primerExamen.sePuedeRecuperar();
        System.out.println(primerExamen.getNroReintentos());

    }
}
