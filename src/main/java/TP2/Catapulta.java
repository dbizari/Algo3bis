package TP2;

import Excepciones.NoPuedeMoverseException;

public class Catapulta extends NoMovibleYNoCura {

    public Catapulta (Coordenada coordenadaUnidad) {
        this.vida = 50;
        this.costo = 5;
        this.danioCuerpoACuerpo = 0;
        this.danioADistancia = 20;
        this.coordenada = coordenadaUnidad;
        this.gps = new GPS();
    }

    @Override
    public void mover(Coordenada coordenada) throws NoPuedeMoverseException {
        throw new NoPuedeMoverseException();
    }
}
