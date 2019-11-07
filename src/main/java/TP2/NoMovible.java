package TP2;

public abstract class NoMovible extends Unidad {

    public void mover(int x, int y) {
        throw new NoPuedeMoverseException;
    }
}
