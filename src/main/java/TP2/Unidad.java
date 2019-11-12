package TP2;

import Excepciones.ErrorAutoAtaque;
import Excepciones.NoPuedeCurar;
import Excepciones.NoPuedeMoverseException;
import Excepciones.PuntosInsuficientesException;

public abstract class Unidad {
    protected Vida vida;
    protected int costo;
    protected int danioCuerpoACuerpo;
    protected int danioADistancia;
    protected int curacion;
    protected Coordenada coordenada;
    private Jugador dueño;

    public abstract void mover(Coordenada coordenada) throws NoPuedeMoverseException;
    public abstract void curar(Unidad unidad) throws NoPuedeCurar;

    public void atacar(Unidad unidad) throws ErrorAutoAtaque {
        if(coordenada.estanADistanciaCercana(this, unidad)) {
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
        vida.sufrirAtaque(danio);
        if (vida.estaMuerto()) {
            dueño.sufrirAtaque();
        }
    }

    public void ganarVida(int cantVida) {
        vida.ganarVida(cantVida);
    }

    public int verVidaRestante(){
        return vida.verVidaRestante();
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Unidad){
            Unidad u = (Unidad) o;
            if(this.coordenada.equals(u.coordenada)) //Una unidad es igual a otra si esta en la misma coordenada
                return true;
        }

        return false;
    }
}
