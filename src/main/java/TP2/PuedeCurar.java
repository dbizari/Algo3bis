package TP2;

import Excepciones.NoPuedeCurar;

public abstract class PuedeCurar extends Movible {

    public void curar(Unidad unidad) throws NoPuedeCurar {
        if(gps.estanADistanciaCercana(this, unidad)) {
            unidad.ganarVida(this.curacion);
        }
    }
}