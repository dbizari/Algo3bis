package TP2;

import Excepciones.ErrorAutoAtaque;

public class Curandero extends PuedeCurar {

    public Curandero (Coordenada coordenadaUnidad) {
        this.vida = new Vida(100);
        this.costo = 2;
        this.danioCuerpoACuerpo = 0;
        this.danioADistancia = 0;
        this.curacion = 15;
        this.coordenada = coordenadaUnidad;
    }

    public void atacar(Unidad unidad) throws ErrorAutoAtaque {
        if(coordenada.estanADistanciaCercana(this, unidad)) {
            unidad.sufrirAtaque(this.danioCuerpoACuerpo);
        } else {
            unidad.sufrirAtaque(this.danioADistancia);
        }
    }
}
