package Excepciones;

public class ErrorAutoAtaque  extends Throwable {
    public ErrorAutoAtaque() {
        super();

    }

    public ErrorAutoAtaque (String message) {
        super(message);
    }
}