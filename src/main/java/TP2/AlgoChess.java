package TP2;

import Excepciones.*;

import java.util.ArrayList;
import java.util.HashMap;

public class AlgoChess {

    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;

    public AlgoChess(int cantFilas, int cantCol){

        tablero = new Tablero(cantFilas, cantCol);
    }

    public void agregarJugador(String nombre, int sector){
        if(sector == 1){
            jugador1 = new Jugador(nombre, sector);
        }
        jugador2 = new Jugador(nombre, sector);
    }

    private Jugador identificarJugador(String nombreJugador) {
        if(jugador1.getNombre() == nombreJugador) {
            return jugador1;
        }
        return jugador2;
    }

    public void colocarCatapultaPara(String nombreJugador, int x, int y) throws PuntosInsuficientesException, CoordenadaFueraDeRango, CeldaDeTerritorioEnemigo, CeldaOcupada {
        Catapulta catapulta = new Catapulta(x, y); //PREGUNTAR SI NO SE PUEDE COLOCAR COMO LA BORRO DESPUES????
        Jugador jugador = identificarJugador(nombreJugador);
        catapulta.colocarUnidad(jugador);
        this.colocarUnidad(catapulta);
    }

    public void colocarSoldadoInfanteriaPara(String nombreJugador, int x, int y) throws PuntosInsuficientesException, CoordenadaFueraDeRango, CeldaDeTerritorioEnemigo, CeldaOcupada {
        SoldadoInfanteria soldadoInfanteria = new SoldadoInfanteria(x, y); //PREGUNTAR SI NO SE PUEDE COLOCAR COMO LA BORRO DESPUES????
        Jugador jugador = identificarJugador(nombreJugador);
        soldadoInfanteria.colocarUnidad(jugador);
        this.colocarUnidad(soldadoInfanteria);
    }
    public void colocarCuranderoPara(String nombreJugador, int x, int y) throws PuntosInsuficientesException, CoordenadaFueraDeRango, CeldaDeTerritorioEnemigo, CeldaOcupada {
        Curandero curandero = new Curandero(x, y); //PREGUNTAR SI NO SE PUEDE COLOCAR COMO LA BORRO DESPUES????
        Jugador jugador = identificarJugador(nombreJugador);
        curandero.colocarUnidad(jugador);
        this.colocarUnidad(curandero);
    }
    public void colocarJinetePara(String nombreJugador, int x, int y) throws PuntosInsuficientesException, CoordenadaFueraDeRango, CeldaDeTerritorioEnemigo, CeldaOcupada {
        Jinete jinete = new Jinete(x, y); //PREGUNTAR SI NO SE PUEDE COLOCAR COMO LA BORRO DESPUES????
        Jugador jugador = identificarJugador(nombreJugador);
        jinete.colocarUnidad(jugador);
        this.colocarUnidad(jinete);
    }

    public void colocarUnidad(Unidad unidad) throws CoordenadaFueraDeRango, CeldaDeTerritorioEnemigo, CeldaOcupada {
        tablero.colocarUnidad(unidad);
    }

    public void atacarDesdeHasta(int desdeFil, int desdeCol, int hastaFil, int hastaCol) throws ErrorAutoAtaque, ErrorNoHayUnidadAtacante {
       tablero.atacarDesdeHasta(desdeFil, desdeCol, hastaFil, hastaCol);
    }

    public void curarDesdeHasta(int desdeFil, int desdeCol, int hastaFil, int hastaCol) throws NoPuedeCurar, ErrorAutoAtaque, ErrorNoHayUnidadAtacante {
        tablero.curarDesdeHasta(desdeFil, desdeCol, hastaFil, hastaCol);
    }

    public void moverUnidadDesdeHasta(int desdeFil, int desdeCol, int hastaFil, int hastaCol) throws CeldaOcupada, NoPuedeMoverseException {
        tablero.moverUnidadDesdeHasta(desdeFil, desdeCol, hastaFil, hastaCol);
    }

    public int getCantFilasTablero() {
        return tablero.getCantFilas();
    }

    public int getCantColumnasTablero() {
        return tablero.getCantColumnas();
    }

    public boolean seTermino(){
        if(jugador1.perdio()) {
            System.out.print("Perdió:" + jugador1.getNombre());
            return true;
        } else if (jugador2.perdio()) {
            System.out.print("Perdió:" + jugador2.getNombre());
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getCoordenadasUnidadEn(int x, int y) {
        //CLASE SOLO PARA PROBAR CORRECTO FUNCIONAMIENTO, DEBERIA SER PRIVADA
        return tablero.getCoordenadasUnidadEn(x, y);
    }

    public int verVida(int x, int y) {
        return tablero.verVida(x, y);
    }
}
