public class FechaException extends Exception{
    public FechaException() {
        super();
    }

    public FechaException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Se produjo la siguiente excepción: " + getMessage();
    }
}
