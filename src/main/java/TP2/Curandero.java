package TP2;

public class Curandero extends Movible {
    private int curacion;

    public Curandero (int x, int y) {
        this.vida = 75;
        this.costo = 2;
        this.danioCuerpoACuerpo = 0;
        this.danioADistancia = 0;
        this.curacion = 15;
        this.x = x;
        this.y = y;
    }
}