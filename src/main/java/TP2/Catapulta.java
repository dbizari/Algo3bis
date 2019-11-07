package TP2;

import Excepciones.NoPuedeMoverseException;

public class Catapulta extends NoMovible {

    public Catapulta (int x, int y) {
        this.vida = 50;
        this.costo = 5;
        this.danioCuerpoACuerpo = 0;
        this.danioADistancia = 20;
        this.x = x;
        this.y = y;
    }
    @Override
    public void mover(int x, int y) throws NoPuedeMoverseException {}
    @Override
    public void atacar(){} //TODO pensar regla de ataque
}
