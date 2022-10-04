package com.company.practica2;

public abstract class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anioDeFabricacion;

    //Constructor}

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
    }

    //Método
    public double montoDeAlquiler() {
        double montoTotal;
        if (getAnioDeFabricacion() > 2020) {
            montoTotal = precioBase + valorAdicional;
        } else {
            montoTotal = precioBase;
        }
        return montoTotal;
    }

    //Getters
    public Capitan getCapitan() {
        return capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }
}
