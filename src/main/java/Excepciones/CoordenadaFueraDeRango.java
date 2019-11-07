package Excepciones;

public class CoordenadaFueraDeRango  extends Throwable {
    public CoordenadaFueraDeRango() {
        super();

    }

    public CoordenadaFueraDeRango (String message) {
        super(message);
    }
}
