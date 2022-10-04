package com.company.practica3;

import java.util.Date;

public class PacienteParticular extends Paciente{
    private int dni;
    private double precioConsulta;

    //Constructor
    public PacienteParticular(Consulta consulta, String nombre, String apellido, boolean esPrimeraConsulta, int dni, double precioConsulta) {
        super(consulta, nombre, apellido, esPrimeraConsulta);
        this.dni = dni;
        this.precioConsulta = precioConsulta;
    }

    //Getters
    public int getDni() {
        return dni;
    }

    public double getPrecioConsulta() {
        return precioConsulta;
    }

}00
