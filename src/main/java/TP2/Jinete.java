package TP2;

public class Jinete extends NoCura {

    public Jinete (Coordenada coordenadaUnidad) {
        this.vida = new Vida(100);
        this.costo = 3;
        this.danioCuerpoACuerpo = 5;
        this.danioADistancia = 15;
        this.coordenada = coordenadaUnidad;
    }
}
