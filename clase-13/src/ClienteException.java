public class ClienteException extends Exception{
    public ClienteException() {
        super();
    }

    public ClienteException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Se produjo la siguiente excepción: " + getMessage();
    }
}
