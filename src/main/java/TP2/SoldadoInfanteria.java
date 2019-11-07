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
    }
    @Override
    public void mover(int x, int y) throws NoPuedeMoverseException {}
    @Override
    public void atacar(){} //TODO pensar regla de ataque
}
