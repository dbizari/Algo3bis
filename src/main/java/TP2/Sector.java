package TP2;

import java.util.*;

public class Sector {
    List<Integer> limiteMinimo;
    List<Integer> limiteMaximo;
    Jugador jugadorEnSector;

    public Sector(List<Integer> limiteMinimoSector, List<Integer> limiteMaximoSector, Jugador jugador) {
         limiteMinimo = limiteMinimoSector;
         limiteMaximo = limiteMaximoSector;
         jugadorEnSector = jugador;
    }

    public Jugador getJugador() {
        return jugadorEnSector;
    }

    public Integer getLimiteMinimoFila(){
        return limiteMinimo.get(0);
    }

    public Integer getLimiteMinimoColumna(){
        return limiteMinimo.get(1);
    }

    public Integer getLimiteMaximoFila(){
        return limiteMaximo.get(0);
    }

    public Integer getLimiteMaximoColumna(){
        return limiteMaximo.get(1);
    }

}
