package TP2;

import Excepciones.NoPuedeMoverseException;

import java.util.ArrayList;

public abstract class Movible extends Unidad {

    public void mover(int x, int y) throws NoPuedeMoverseException {
        this.x = x;
        this.y = y;
    }
}
