package com.company;

public class Main {
    public static void main(String[] args) {
        // Aunque no haga el casteo y la cuenta1 sea de tipo Cuenta, me toma los métodos de CuentaComitente,
        // Sigo sin entender de que me sirve el polimorfismo
        Cuenta cuenta1 = new CuentaComitente();
        cuenta1.depositar(100);
        System.out.println("Saldo después del deposito inicial: " + cuenta1.informarSaldo());
        cuenta1.extraer(51);
        System.out.println("Saldo despues de la extración es: " + cuenta1.informarSaldo());
    }
}
