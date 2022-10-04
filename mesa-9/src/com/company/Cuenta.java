package com.company;

public abstract class Cuenta {
    // Atributo
    private double saldo;

    // Métodos
    public void depositar(double monto) {
        saldo += monto;
    }

    public double informarSaldo() {
        return saldo;
    }

    // Método abstracto
    public abstract void extraer(double monto);

    // Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
