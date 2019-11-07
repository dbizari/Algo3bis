package TP2;

import Excepciones.NoPuedeMoverseException;

public class Curandero extends PuedeCurar {

    private int curacion;

    public Curandero (int x, int y) {
        this.vida = 75;
        this.costo = 2;
        this.danioCuerpoACuerpo = 0;
        this.danioADistancia = 0;
        this.curacion = 15;
        this.x = x;
        this.y = y;
        this.gps = new GPS();
    }

    public void curar(Unidad unidad) {
        if(gps.estanADistanciaCercana(this, unidad)) {
            unidad.ganarVida(this.curacion);
        }
    }
}
