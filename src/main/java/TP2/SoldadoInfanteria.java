package TP2;

public class SoldadoInfanteria extends NoCura {

    public SoldadoInfanteria(Coordenada coordenadaUnidad){
        this.vida = new Vida(100);
        this.costo = 1;
        this.danioCuerpoACuerpo = 10;
        this.danioADistancia = 0;
        this.coordenada = coordenadaUnidad;
    }
}
