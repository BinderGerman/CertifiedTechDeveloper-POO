package com.company;

public class CajaDeAhorro extends Cuenta{
    // Atributo constante
    public static final double INTERES_CAJA_AHORRO = 1.2;

    // Método
    public void cobrarIntereses() {
        setSaldo(informarSaldo() * CajaDeAhorro.INTERES_CAJA_AHORRO);
    }

    // Método sobreescrito
    @Override
    public void extraer(double monto) {
        if(informarSaldo() >= monto)
            setSaldo(informarSaldo() - monto);

    }
}
