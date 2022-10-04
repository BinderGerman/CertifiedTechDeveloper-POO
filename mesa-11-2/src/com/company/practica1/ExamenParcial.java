package com.company.practica1;

public class ExamenParcial extends Examen{
    private int nroUnidad;
    private int nroReintentos;

    //Constructor
    public ExamenParcial(Alumno alumno, String titulo, String enunciado, double nota, int nroUnidad) {
        super(alumno, titulo, enunciado, nota);
        this.nroUnidad = nroUnidad;
        nroReintentos = 0;
    }

    //Método
    public int sePuedeRecuperar() {
        final int MINIMA_NOTA_APROBABLE = 4;
        if (getNota() < MINIMA_NOTA_APROBABLE) {
            if (this.nroUnidad <= 3) {
                this.nroReintentos += 3;
            } else {
                this.nroReintentos += 2;
            }

        } else {
            System.out.println("No hace falta recuperar el alumno ya esta aprobado");
        }
        return nroReintentos;
    }

    @Override
    public boolean estaAprobado() {
        final int MINIMA_NOTA_APROBABLE = 4;
        return getNota() >= MINIMA_NOTA_APROBABLE;
    }

    //Getters
    public int getNroUnidad() {
        return nroUnidad;
    }

    public int getNroReintentos() {
        return nroReintentos;
    }

}
