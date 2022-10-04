package com.company.practica3;

import java.util.Date;

public class PacienteObraSocial extends Paciente implements Comparable{
    private String nombreObraSocial;
    private int numAsociado;

    //Constructor
    public PacienteObraSocial(Consulta consulta, String nombre, String apellido, boolean esPrimeraConsulta, String nombreObraSocial, int numAsociado) {
        super(consulta, nombre, apellido, esPrimeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numAsociado = numAsociado;
    }

    //Método
    @Override
    public int compareTo(Object o) {
        return this.numAsociado - ((PacienteObraSocial) o).getNumAsociado();
    }

    //Getters
    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public int getNumAsociado() {
        return numAsociado;
    }
}
