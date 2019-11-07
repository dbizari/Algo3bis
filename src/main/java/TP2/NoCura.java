package TP2;

import Excepciones.NoPuedeCurar;

public abstract class NoCura extends Movible {

    public void curar(Unidad unidad) throws NoPuedeCurar {
        throw new NoPuedeCurar();
    }
}
