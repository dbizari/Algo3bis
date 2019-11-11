package TP2;

import Excepciones.CeldaDeTerritorioEnemigo;
import Excepciones.CoordenadaFueraDeRango;

public class Coordenada {
    public int x;
    public int y;
    private int maxDistanciaCercana = 2;
    private int maxDistanciaMedia = 5;

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

    public boolean estanADistanciaCercana(Unidad unidad1, Unidad unidad2) {
        // HAY QUE VERIFICAR QUE NO SEA UN AUTOATAQUE PORQUE SERIA UN BUG
        Coordenada coordenadas1 = unidad1.getCoordenadas();
        Coordenada coordenadas2 = unidad2.getCoordenadas();

        int x1 = coordenadas1.getCoordenadaX();
        int y1 = coordenadas1.getCoordenadaY();

        int x2 = coordenadas2.getCoordenadaX();
        int y2 = coordenadas2.getCoordenadaY();

        if( moduloDiferencia(x1, x2) <= maxDistanciaCercana && moduloDiferencia(y1, y2) <= maxDistanciaCercana) {
            return true;
        } else {
            return false;
        }
    }

    public int moduloDiferencia(int n1, int n2) {
        if ((n1-n2) > 0) {
            return n1-n2;
        }
        return n2-n1;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Coordenada){
            Coordenada c = (Coordenada) o;
            if(this.x == c.getCoordenadaX() && this.y == c.getCoordenadaY())
                return true;
        }

        return false;
    }
}
