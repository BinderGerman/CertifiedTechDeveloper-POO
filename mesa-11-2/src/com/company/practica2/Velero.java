package com.company.practica2;

public class Velero extends Embarcacion {
    private int cantMastiles;

    //Constructor

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int añoDeFabricacion, int cantMastiles) {
        super(capitan, precioBase, valorAdicional, añoDeFabricacion);
        this.cantMastiles = cantMastiles;
    }

    //Método
    public boolean esGrande() {
        final int CANT_MASTILES_MINIMOS = 4;
        return getCantMastiles() > CANT_MASTILES_MINIMOS;
    }

    //Getters
    public int getCantMastiles() {
        return cantMastiles;
    }
}
