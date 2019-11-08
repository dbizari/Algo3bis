package Excepciones;

public class NoPuedeAtacar  extends Throwable {
    public NoPuedeAtacar() {
        super();

    }

    public NoPuedeAtacar (String message) {
        super(message);
    }
}