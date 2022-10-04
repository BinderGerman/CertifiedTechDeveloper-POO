package com.company;

public class Programa {
    public static void main(String[] args) {
        // Instanciación de objeto german
        Cliente german = new Cliente(1010, "German");
        // Linea 8 - uso de Get
        System.out.println("Número de german: " + german.getNumeroCliente());
        german.setNumeroCliente(2020);
        System.out.println("Número nuevo de german: " + german.getNumeroCliente());
        german.incrementarDeuda(1500.50);
        System.out.println("Deuda de german: " + german.getDeuda());

    }
}
