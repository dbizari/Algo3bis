package TP2;

import Excepciones.NoPuedeMoverseException;

import java.util.ArrayList;


public abstract class NoMovible extends Unidad {

    public void mover(int x, int y) throws NoPuedeMoverseException {
        throw new NoPuedeMoverseException();
    }
}
