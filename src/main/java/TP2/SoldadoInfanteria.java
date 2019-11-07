package TP2;

import Excepciones.NoPuedeMoverseException;

public class SoldadoInfanteria extends Movible {

    public SoldadoInfanteria(int x, int y){
        this.vida = 100;
        this.costo = 1;
        this.danioCuerpoACuerpo = 10;
        this.danioADistancia = 0;
        this.x = x;
        this.y = y;
        this.gps = new GPS();
    }

    @Override
    public abstract void curar(Unidad unidad);
}
