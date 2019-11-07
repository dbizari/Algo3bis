package Excepciones;

public class CeldaOcupada  extends Throwable {
    public CeldaOcupada() {
        super();

    }

    public CeldaOcupada (String message) {
        super(message);
    }
}