package TP2;

public class Puntaje {
    private Integer puntos;

    public Puntaje() {
        puntos = 20;
    }

    public void descontarPuntos (Integer puntosAdescontar) {
        puntos = puntos - puntosAdescontar;
    }
}
