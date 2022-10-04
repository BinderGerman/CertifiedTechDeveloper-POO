package com.company.practica2;

public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Germán", "Binder", 1234);

        Velero velero1 = new Velero(capitan1, 20000, 10000, 2021, 5);
        System.out.println("El valor del alquiler de velero1 es: " + velero1.montoDeAlquiler());
        System.out.println("El velero1 es grande?: " + velero1.esGrande());

        Yate yate1 = new Yate(capitan1, 30000, 15000, 2020,5);
        Yate yate2 = new Yate(capitan1, 25000, 15000, 2021, 3);
        System.out.println("El valor del alquiler de yate1 es: " + yate1.montoDeAlquiler());
        System.out.println("yate1 es mas grande que yate2?: " + yate1.compareTo(yate2));


    }
}
