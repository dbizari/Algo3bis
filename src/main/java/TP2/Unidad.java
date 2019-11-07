package TP2;

public abstract class Unidad {
    protected int vida;
    protected int costo;
    protected int danioCuerpoACuerpo;
    protected int danioADistancia;
    protected int x;
    protected int y;

    public abstract void mover(int x, int y);
    public abstract void atacar(); //TODO pensar regla de ataque

}
