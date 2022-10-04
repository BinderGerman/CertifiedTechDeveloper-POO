package com.company.practica1;

public abstract class Examen {
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    private double nota;

    //Constructor
    public Examen(Alumno alumno, String titulo, String enunciado, double nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    //Método
    public abstract boolean estaAprobado();

    //Getters
    public Alumno getAlumno() {
        return alumno;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public double getNota() {
        return nota;
    }
}
