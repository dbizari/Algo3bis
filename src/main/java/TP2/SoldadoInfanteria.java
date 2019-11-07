package TP2;

public class SoldadoInfanteria extends Movible {

    public SoldadoInfanteria(int x, int y){
        this.vida = 100;
        this.costo = 1;
        this.danioCuerpoACuerpo = 10;
        this.danioADistancia = 0;
        this.x = x;
        this.y = y;
    }
}
