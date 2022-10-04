public abstract class Cuenta {
    private double saldo;
    private Cliente cliente;

    //Constructor
    public Cuenta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    // Métodos
    public void depositar(double monto) {
        this.saldo += monto;
    }

    public double informarSaldo() {
        return saldo;
    }

    // Método abstracto
    public abstract void extraer(double monto);

    // Getter y Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}


