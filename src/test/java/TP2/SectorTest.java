package TP2;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.TestCase.assertTrue;

public class SectorTest {

    @Test public void testSectorEsCreadoCorrectamente(){
        List<Integer> limiteMinimoSectorPrueba = new ArrayList<Integer>();
        List<Integer> limiteMaximoSectorPrueba = new ArrayList<Integer>();
        Jugador jugador = new Jugador();
        limiteMinimoSectorPrueba.add(0);
        limiteMinimoSectorPrueba.add(1);
        limiteMaximoSectorPrueba.add(2);
        limiteMaximoSectorPrueba.add(3);

        Sector sectorPrueba = new Sector(limiteMinimoSectorPrueba, limiteMaximoSectorPrueba, jugador);

        Jugador jugadorDelSector = sectorPrueba.getJugador();

        assertTrue(jugadorDelSector instanceof Jugador);
        Assert.assertEquals(new BigDecimal(0), new BigDecimal(sectorPrueba.getLimiteMinimoFila()));
        Assert.assertEquals(new BigDecimal(1), new BigDecimal(sectorPrueba.getLimiteMinimoColumna()));
        Assert.assertEquals(new BigDecimal(2), new BigDecimal(sectorPrueba.getLimiteMaximoFila()));
        Assert.assertEquals(new BigDecimal(3), new BigDecimal(sectorPrueba.getLimiteMaximoColumna()));
    }
}
