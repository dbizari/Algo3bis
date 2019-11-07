package TP2;

public class Catapulta extends NoMovibleYNoCura {

    public Catapulta (int x, int y) {
        this.vida = 50;
        this.costo = 5;
        this.danioCuerpoACuerpo = 0;
        this.danioADistancia = 20;
        this.x = x;
        this.y = y;
        this.gps = new GPS();
    }
}
