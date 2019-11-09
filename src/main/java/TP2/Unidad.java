package TP2;

import Excepciones.NoPuedeCurar;
import Excepciones.NoPuedeMoverseException;
import Excepciones.PuntosInsuficientesException;

public abstract class Unidad {
    protected int vida;
    protected int costo;
    protected int danioCuerpoACuerpo;
    protected int danioADistancia;
    protected int curacion;
    protected Coordenada coordenada;
    //protected int x;
    //protected int y;
    private Jugador dueño;
    protected GPS gps;

    public abstract void mover(int x, int y) throws NoPuedeMoverseException;
    public abstract void curar(Unidad unidad) throws NoPuedeCurar;

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

    public Coordenada getCoordenadas(){
        return coordenada;
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
    //HAY QUE VERIFICAR QUE SI SUPERA LA VIDA ORIGINAL DEL BJETO NO SE SUME, SINO QUE VUELVA A LA VIDA TOTAL PERO NUNCA
    //MAS QUE ESO PORQUE SERIA UN BUG

    public int verVida(){
        return vida;
    }

}
