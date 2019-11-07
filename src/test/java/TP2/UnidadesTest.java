package TP2;

import Excepciones.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class UnidadesTest {

    @Test
    public void testUnidadMovibleSePuedeMoverEnTodasLasDirecciones() throws PuntosInsuficientesException, CeldaDeTerritorioEnemigo, CeldaOcupada, NoPuedeMoverseException, CoordenadaFueraDeRango {
        AlgoChess juego = new AlgoChess(20,20);
        juego.agregarJugador("maria", 1);
        juego.colocarJinetePara("maria", 1,1);
        juego.moverUnidadDesdeHasta(1,1,12,16);
        juego.moverUnidadDesdeHasta(12,16,3,4);
        juego.moverUnidadDesdeHasta(3,4,10,7);
        juego.moverUnidadDesdeHasta(10,7,4,5);
        juego.moverUnidadDesdeHasta(4,5,18,18);

        ArrayList<Integer> coordenadas1 = new ArrayList<Integer>();
        coordenadas1.add(18);
        coordenadas1.add(18);

        ArrayList<Integer> coordenadas2 = juego.getCoordenadasUnidadEn(18, 18);

        boolean sonIguales = true;

        for (int i= 0; i < coordenadas1.size(); i++) {
            if(coordenadas1.get(i) != coordenadas2.get(i)) {
                Assert.assertFalse(sonIguales);
            }
        }
        Assert.assertTrue(sonIguales);

    }

    @Test (expected = CeldaOcupada.class)
    public void testUnidadNoPuedeMoverseACasilleroOcupado() throws PuntosInsuficientesException, CeldaDeTerritorioEnemigo, CeldaOcupada, NoPuedeMoverseException, CoordenadaFueraDeRango {
        AlgoChess juego = new AlgoChess(20,20);
        juego.agregarJugador("maria", 1);
        juego.colocarJinetePara("maria", 1,1);
        juego.colocarCuranderoPara("maria", 2, 5);
        juego.moverUnidadDesdeHasta(1,1,2,5);
    }

    @Test
    public void testAtaqueConSIDescuentaVidaCorrecta() throws ErrorAutoAtaque, ErrorNoHayUnidadAtacante, PuntosInsuficientesException, CeldaDeTerritorioEnemigo, CeldaOcupada, NoPuedeMoverseException, CoordenadaFueraDeRango {
        AlgoChess juego = new AlgoChess(20,20);

        juego.agregarJugador("maria", 1);
        juego.agregarJugador("jose", 1);

        juego.colocarJinetePara("maria", 9,1);
        juego.colocarSoldadoInfanteriaPara("jose", 11,1);

        juego.atacarDesdeHasta(11, 1, 9,1);

        Assert.assertEquals(90, juego.verVida(9,1));
    }

    @Test
    public void testAtaqueConJineteDescuentaVidaCorrecta() throws ErrorAutoAtaque, ErrorNoHayUnidadAtacante, PuntosInsuficientesException, CeldaDeTerritorioEnemigo, CeldaOcupada, NoPuedeMoverseException, CoordenadaFueraDeRango {
        AlgoChess juego = new AlgoChess(20,20);

        juego.agregarJugador("maria", 1);
        juego.agregarJugador("jose", 1);

        juego.colocarJinetePara("maria", 9,1);
        juego.colocarSoldadoInfanteriaPara("jose", 11,1);

        juego.atacarDesdeHasta(9, 1, 11,1);

        Assert.assertEquals(95, juego.verVida(11,1));
    }

    @Test
    public void testAtaqueConCatapultaDescuentaVidaCorrecta() throws ErrorAutoAtaque, ErrorNoHayUnidadAtacante, PuntosInsuficientesException, CeldaDeTerritorioEnemigo, CeldaOcupada, NoPuedeMoverseException, CoordenadaFueraDeRango {
        AlgoChess juego = new AlgoChess(20,20);

        juego.agregarJugador("maria", 1);
        juego.agregarJugador("jose", 1);

        juego.colocarJinetePara("maria", 3,1);
        juego.colocarCatapultaPara("jose", 11,1);

        juego.atacarDesdeHasta(11, 1, 3,1);

        Assert.assertEquals(80, juego.verVida(3,1));
    }

    @Test
    public void testCuranderoAgregaVidaCorrecta() throws ErrorAutoAtaque, ErrorNoHayUnidadAtacante, PuntosInsuficientesException, CeldaDeTerritorioEnemigo, CeldaOcupada, NoPuedeMoverseException, CoordenadaFueraDeRango {
        AlgoChess juego = new AlgoChess(20,20);

        juego.agregarJugador("maria", 1);
        juego.agregarJugador("jose", 1);

        juego.colocarJinetePara("maria", 9,1);
        juego.colocarCuranderoPara("jose", 10, 1);
        juego.colocarSoldadoInfanteriaPara("jose", 11,1);

        juego.atacarDesdeHasta(9, 1, 11,1);
        juego.curarDesdeHasta(10,1,11,1);

        Assert.assertEquals(95, juego.verVida(11,1));
    }



}
