package com.company.practica2;

public class Yate extends Embarcacion implements Comparable {
    private int cantCamarotes;

    //Constructor
    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioDeFabricacion, int cantCamarotes) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yate yate1 = (Yate) o;
        int respuesta = 0;
        if (this.cantCamarotes > yate1.getCantCamarotes())
            respuesta = 1;
        if (this.cantCamarotes < yate1.getCantCamarotes())
            respuesta = -1;
        return respuesta;
    }

    //Getters
    public int getCantCamarotes() {
        return cantCamarotes;
    }
}
