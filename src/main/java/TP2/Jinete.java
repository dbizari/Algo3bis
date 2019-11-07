package TP2;

import Excepciones.NoPuedeMoverseException;

public class Jinete extends Movible {

    public Jinete (int x, int y) {
        this.vida = 100;
        this.costo = 3;
        this.danioCuerpoACuerpo = 5;
        this.danioADistancia = 15;
        this.x = x;
        this.y = y;
    }
    @Override
    public void mover(int x, int y) throws NoPuedeMoverseException {}
    @Override
    public void atacar(){} //TODO pensar regla de ataque
}
