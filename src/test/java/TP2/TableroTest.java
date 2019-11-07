/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TP2;

import org.junit.Assert;
import org.junit.Test;

public class TableroTest {
    @Test
    public void testTableroEsCreadoCorrectamenteConAltoYAncho() {

        Tablero tablero = new Tablero();
        Assert.assertEquals(10, tablero.getLargoSector1());
        Assert.assertEquals(10, tablero.getLargoSector2());
    }

    @Test
    public void testNoSePuedeColocarUnaPiezaAliadaEnUnCasilleroDelSectorEnemigo(){
        Tablero tablero = new Tablero();
        Jugador jugador1 = new Jugador("tomas", 1);
        Jugador jugador2 = new Jugador("tomas", 2);
        int fila1 = 11;
        int fila2 = 5;

        Assert.assertEquals(false, tablero.colocarPieza(jugador1.getSector(), fila1));
        Assert.assertEquals(false, tablero.colocarPieza(jugador2.getSector(), fila2));

    }
}

