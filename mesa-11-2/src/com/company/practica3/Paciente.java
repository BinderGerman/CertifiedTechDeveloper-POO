package com.company.practica3;

import java.util.Date;

public abstract class Paciente {
    private Consulta consulta;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private boolean esPrimeraConsulta;

    //Constructor
    public Paciente(Consulta consulta, String nombre, String apellido, boolean esPrimeraConsulta) {
        this.consulta = consulta;
        this.nombre = nombre;
        this.apellido = apellido;
        fechaDeNacimiento = new Date();
        this.esPrimeraConsulta = esPrimeraConsulta;
    }

    //Método
    public boolean hacerEvaluacionInicial() {
        return getEsPrimeraConsulta();
    }

    //Getters
    public Consulta getConsulta() {
        return consulta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public boolean getEsPrimeraConsulta() {
        return esPrimeraConsulta;
    }

    //Setters
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
