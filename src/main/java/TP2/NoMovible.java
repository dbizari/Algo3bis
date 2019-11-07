package TP2;

import Excepciones.NoPuedeMoverseException;


public abstract class NoMovible extends Unidad {

    public void mover(int x, int y) throws NoPuedeMoverseException {
        throw new NoPuedeMoverseException();
    }
}
