public class Cliente {
    private String nombre;
    private String apellido;
    private String documento;
    private double saldoEnCuenta;
    private double limite;

    //Constructor
    public Cliente(String nombre, String apellido, String documento, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.limite = limite;
        saldoEnCuenta = 0;
    }

    public void comprar(double importe) throws ClienteException {
        if (saldoEnCuenta + importe > limite) {
            throw new ClienteException("Error. No se puede comprar porque no tiene margen para realizar la compra");
        } else {
            saldoEnCuenta += importe;
        }

    }

    public void saldarDeuda(double importe) throws ClienteException {
        if (importe > saldoEnCuenta) {
            throw new ClienteException("Error. Usted quiere pagar más de lo que debe");
        } else {
            saldoEnCuenta -= importe;
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + apellido + " " + nombre + " Deuda: " + saldoEnCuenta;
    }
}
