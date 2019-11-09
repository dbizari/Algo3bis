package TP2;

/*public class Arbitro {

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
        Coordenada coordenadas = unidad.getCoordenadas();
        if(coordenadas.getCoordenadaX(0) > rangoMaxFil || coordenadas.getCoordenadaY(0) < rangoMinFil || coordenadas.getCoordenadaX() > rangoMaxCol || coordenadas.get(1) < rangoMinCol) {
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
}*/
