package com.company.practica1;

public class ExamenFinal extends Examen implements Comparable {
    private double notaOral;
    private String descripcion;

    //Constructor
    public ExamenFinal(Alumno alumno, String titulo, String enunciado, double nota, double notaOral, String descripcion) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcion = descripcion;
    }

    @Override
    public boolean estaAprobado() {
        final int MINIMA_NOTA_APROBABLE = 4;
        return getNota() >= MINIMA_NOTA_APROBABLE && this.notaOral >= MINIMA_NOTA_APROBABLE;
    }

    @Override
    public int compareTo(Object o) {
        ExamenFinal exFinal = (ExamenFinal) o;
        int respuesta = 0;
        if ((getNota() + this.notaOral / 2) > (exFinal.getNota() + exFinal.notaOral) / 2)
            respuesta = 1;
        if ((getNota() + this.notaOral / 2) < (exFinal.getNota() + exFinal.notaOral) / 2)
            respuesta = -1;
        return respuesta;
    }

    //Getter
    public double getNotaOral() {
        return notaOral;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
