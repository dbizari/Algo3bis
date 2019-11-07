package TP2;

import Excepciones.NoPuedeMoverseException;

import java.util.ArrayList;

public abstract class Unidad {
    protected int vida;
    protected int costo;
    protected int danioCuerpoACuerpo;
    protected int danioADistancia;
    protected int x;
    protected int y;

    public abstract void mover(int x, int y) throws NoPuedeMoverseException;
    public abstract void atacar(); //TODO pensar regla de ataque

    public int getCosto(){
        return costo;
    }

    public ArrayList<Integer> getCoordenadas(){
        ArrayList<Integer> coordenadas = new ArrayList<Integer>();
        coordenadas.add(x);
        coordenadas.add(y);
        return coordenadas;
    }

}
