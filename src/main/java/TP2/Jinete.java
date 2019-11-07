package TP2;

import Excepciones.NoPuedeCurar;

public class Jinete extends NoCura {

    public Jinete (int x, int y) {
        this.vida = 100;
        this.costo = 3;
        this.danioCuerpoACuerpo = 5;
        this.danioADistancia = 15;
        this.x = x;
        this.y = y;
        this.gps = new GPS();
    }
}
