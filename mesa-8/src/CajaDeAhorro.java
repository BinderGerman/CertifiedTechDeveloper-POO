public class CajaDeAhorro extends Cuenta {

    // Constructor
    public CajaDeAhorro(double saldo, Cliente cliente) {
        super(saldo, cliente);
    }

    @Override
    public void extraer(double monto) {
        if (informarSaldo() >= monto) {
            setSaldo(informarSaldo() - monto);
        }
    }




}
