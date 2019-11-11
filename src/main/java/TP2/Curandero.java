package TP2;

public class Curandero extends PuedeCurar {

    public Curandero (Coordenada coordenadaUnidad) {
        this.vida = new Vida(100);
        this.costo = 2;
        this.danioCuerpoACuerpo = 0;
        this.danioADistancia = 0;
        this.curacion = 15;
        this.coordenada = coordenadaUnidad;
    }

}
