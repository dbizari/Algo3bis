package Excepciones;

public class NoPuedeMoverseException  extends Throwable {
    public NoPuedeMoverseException() {
        super();

    }

    public NoPuedeMoverseException (String message) {
        super(message);
    }
}
