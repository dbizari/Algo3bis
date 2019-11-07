package Excepciones;

public class ErrorNoHayUnidadAtacante  extends Throwable {
    public ErrorNoHayUnidadAtacante() {
        super();

    }

    public ErrorNoHayUnidadAtacante (String message) {
        super(message);
    }
}