package com.company.practica3;

import java.util.Date;

public class Consulta {
    private Date fechaDeConsulta;
    private String especialidad;
    private int hora;
    private int minuto;

    //Constructor
    public Consulta(String especialidad, int hora, int minuto) {
        fechaDeConsulta = new Date();
        this.especialidad = especialidad;
        this.hora = hora;
        this.minuto = minuto;
    }

    //Getters
    public Date getFechaDeConsulta() {
        return fechaDeConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    //Setters
    public void setFechaDeConsulta(Date fechaDeConsulta) {
        this.fechaDeConsulta = fechaDeConsulta;
    }
}
