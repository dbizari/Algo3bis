package TP2;

import Excepciones.CeldaDeTerritorioEnemigo;
import Excepciones.CoordenadaFueraDeRango;

import java.util.ArrayList;

public class Arbitro {

    private Integer rangoMaxCol;
    private Integer rangoMaxFil;
    private Integer rangoMinCol;
    private Integer rangoMinFil;
    private Integer sectorUnoHasta;

    public Arbitro(Integer rangoMaxCol, Integer rangoMaxFil, Integer rangoMinCol, Integer rangoMinFil, Integer sectorUnoHasta){
        this.rangoMaxCol = rangoMaxCol;
        this.rangoMinCol = rangoMinCol;
        this.rangoMaxFil = rangoMaxFil;
        this.rangoMinFil = rangoMinFil;
        this.sectorUnoHasta = sectorUnoHasta;
    }

    public void estaAdentroDelTablero(Unidad unidad) throws CoordenadaFueraDeRango {
        ArrayList<Integer> coordenadas = unidad.getCoordenadas();
        if(coordenadas.get(0) > rangoMaxFil || coordenadas.get(0) < rangoMinFil || coordenadas.get(1) > rangoMaxCol || coordenadas.get(1) < rangoMinCol) {
            throw new CoordenadaFueraDeRango();
        }
    }

    public void estaEnSectorAliado(Unidad unidad) throws CeldaDeTerritorioEnemigo {
        Jugador jugador = unidad.getDueño();
        ArrayList<Integer> coordenadas = unidad.getCoordenadas();
        if(jugador.getSector() == 1 && coordenadas.get(0) > 10 || jugador.getSector() == 2 && coordenadas.get(0) < 10){
            throw new CeldaDeTerritorioEnemigo();
        }
    }
}
