package TP2;

import Excepciones.CeldaDeTerritorioEnemigo;
import Excepciones.CoordenadaFueraDeRango;

public class Coordenada {
    public int x;
    public int y;

    public Coordenada(int coordenadaX, int coordenadaY){
        x = coordenadaX;
        y = coordenadaY;
    }

    public int getCoordenadaX() {
        return x;
    }

    public int getCoordenadaY() {
        return y;
    }

    public void coordenadaDentroDeTablero(Integer rangoMaxFil, Integer rangoMinFil, Integer rangoMaxCol, Integer rangoMinCol) throws CoordenadaFueraDeRango {
        if(this.x > rangoMaxFil || this.x < rangoMinFil || this.y > rangoMaxCol || this.y < rangoMinCol){
            throw new CoordenadaFueraDeRango();
        }
    }

    public void enSectorAliado(Jugador jugador) throws CeldaDeTerritorioEnemigo {
        if (jugador.getSector() == 1 && this.x > 10 || jugador.getSector() == 2 && this.x < 10){
            throw new CeldaDeTerritorioEnemigo();
        }
    }
}
