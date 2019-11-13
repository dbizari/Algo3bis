package TP2;

import Excepciones.ErrorAutoAtaque;

public class SoldadoInfanteria extends NoCura {

    public SoldadoInfanteria(Coordenada coordenadaUnidad){
        this.vida = new Vida(100);
        this.costo = 1;
        this.danioCuerpoACuerpo = 10;
        this.danioADistancia = 0;
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
