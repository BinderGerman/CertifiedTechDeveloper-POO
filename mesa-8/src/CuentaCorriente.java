public class CuentaCorriente extends Cuenta {
    private double descubierto;

    // Constructor
    public CuentaCorriente(double saldo, Cliente cliente) {
        super(saldo, cliente);
        descubierto = 1000;
    }

    @Override
    public void extraer(double monto) {
        if (informarSaldo() + descubierto >= monto) {
            setSaldo(informarSaldo() - monto);
        }
    }
}
