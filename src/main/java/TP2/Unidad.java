package TP2;

import Excepciones.NoPuedeMoverseException;
import Excepciones.PuntosInsuficientesException;

import java.util.ArrayList;

public abstract class Unidad {
    protected int vida;
    protected int costo;
    protected int danioCuerpoACuerpo;
    protected int danioADistancia;
    protected int x;
    protected int y;
    private Jugador dueño;
    protected GPS gps;

    public abstract void mover(int x, int y) throws NoPuedeMoverseException;
    public abstract void curar(Unidad unidad);

    public void atacar(Unidad unidad) {
        if(gps.estanADistanciaCercana(this, unidad)) {
            unidad.sufrirAtaque(this.danioCuerpoACuerpo);
        } else {
            unidad.sufrirAtaque(this.danioADistancia);
        }
    }

    public int getCosto(){
        return costo;
    }

    public Jugador getDueño(){
        return dueño;
    }

    public void colocarUnidad(Jugador jugador) throws PuntosInsuficientesException {

        jugador.colocarUnidad(this);
        dueño = jugador;
    }

    public ArrayList<Integer> getCoordenadas(){
        ArrayList<Integer> coordenadas = new ArrayList<Integer>();
        coordenadas.add(x);
        coordenadas.add(y);
        return coordenadas;
    }

    public void sufrirAtaque(int danio) {
        vida = vida - danio;
        if (vida <= 0) {
            dueño.sufrirAtaque();
        }
    }

    public void ganarVida(int cantVida) {
        vida = vida + cantVida;
    }

    public int verVida(){
        return vida;
    }

}
