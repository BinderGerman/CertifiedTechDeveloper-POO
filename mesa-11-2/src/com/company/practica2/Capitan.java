package com.company.practica2;

public class Capitan {
    private String nombre;
    private String apellido;
    private int matricula;

    //Constructor
    public Capitan(String nombre, String apellido, int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMatricula() {
        return matricula;
    }
}
