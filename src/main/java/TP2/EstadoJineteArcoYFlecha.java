package TP2;

import Excepciones.ErrorAutoAtaque;

public class EstadoJineteArcoYFlecha implements EstadoJinete {
    @Override
    public void atacar (Jinete jinete, Unidad otraUnidad) throws ErrorAutoAtaque {
        if (jinete.coordenada.estanADistanciaMedia(jinete, otraUnidad)) {
            otraUnidad.sufrirAtaque(jinete.danioADistancia);
        }
    }
}
