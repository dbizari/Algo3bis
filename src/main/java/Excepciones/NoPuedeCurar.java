package Excepciones;

public class NoPuedeCurar  extends Throwable {
    public NoPuedeCurar() {
        super();

    }

    public NoPuedeCurar (String message) {
        super(message);
    }
}
