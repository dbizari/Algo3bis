package TP2;

public class Catapulta extends NoMovibleYNoCura {

    public Catapulta (Coordenada coordenadaUnidad) {
        this.vida = 50;
        this.costo = 5;
        this.danioCuerpoACuerpo = 0;
        this.danioADistancia = 20;
        this.coordenada = coordenadaUnidad;
        this.gps = new GPS();
    }
}
