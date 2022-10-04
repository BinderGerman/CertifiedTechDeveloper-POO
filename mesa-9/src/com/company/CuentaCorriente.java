package com.company;

public class CuentaCorriente extends Cuenta{
    // Atributo
    private double descubiertoPermitido;

    // Método sobreescrito
    @Override
    public void extraer(double monto) {
        if(informarSaldo() + descubiertoPermitido >= monto)
            setSaldo(informarSaldo() - monto);
    }

    // Getter y Setter
    public double getDescubiertoPermitido() {
        return descubiertoPermitido;
    }

    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }
}
