package TP2;

import org.junit.Assert;
import org.junit.Test;
import Excepciones.PuntosInsuficientesException;

public class JugadorTest {

    @Test (expected = PuntosInsuficientesException.class)
    public void testSoloPuedeUsarUnidadesSiTienePuntos () {
        Jugador jugador = new Jugador("juan", 2);
        Unidad unidad1 = new Jinete(1,2);
        Unidad unidad2 = new Jinete(2,2);
        Unidad unidad3 = new Jinete(3,2);
        Unidad unidad4 = new Jinete(4,2);
        Unidad unidad5 = new Jinete(5,2);
        Unidad unidad6 = new Jinete(6,2);
        Unidad unidad7 = new SoldadoInfanteria(1,4);
        Unidad unidad8 = new SoldadoInfanteria(1,5);
        Unidad unidad9 = new SoldadoInfanteria(1,6);
        jugador.colocarUnidad(unidad1);
        jugador.colocarUnidad(unidad2);
        jugador.colocarUnidad(unidad3);
        jugador.colocarUnidad(unidad4);
        jugador.colocarUnidad(unidad5);
        jugador.colocarUnidad(unidad6);
        jugador.colocarUnidad(unidad7);
        jugador.colocarUnidad(unidad8);
        jugador.colocarUnidad(unidad9);

    }

    @Test
    public void pierdeElJugadorQueNoTieneMasUnidades() {
        Jugador jugador1 = new Jugador("juan", 1);
        Jugador jugador2 = new Jugador("Tomas", 2);
        Unidad unidad1 = new Jinete(1,2);
        Unidad unidad2 = new Jinete(1,3);
        Unidad unidad3 = new Jinete(1,4);
        Unidad unidad4 = new Jinete(1,5);
        Unidad unidad5 = new Jinete(11,6);
        Unidad unidad6 = new Jinete(11,7);
        Unidad unidad7 = new SoldadoInfanteria(11,8);
        Unidad unidad8 = new SoldadoInfanteria(12,0);
        Unidad unidad9 = new SoldadoInfanteria(13,0);
        jugador1.colocarUnidad(unidad1);
        jugador1.colocarUnidad(unidad2);
        jugador1.colocarUnidad(unidad3);
        jugador1.colocarUnidad(unidad4);
        jugador2.colocarUnidad(unidad5);
        jugador2.colocarUnidad(unidad6);
        jugador2.colocarUnidad(unidad7);
        jugador2.colocarUnidad(unidad8);
        jugador2.colocarUnidad(unidad9);
        jugador1.atacarUnidad(unidad1);
        jugador1.atacarUnidad(unidad2);
        jugador1.atacarUnidad(unidad3);
        jugador1.atacarUnidad(unidad4);

        Assert.assertFalse(jugador2.perdio());
        Assert.assertTrue(jugador1.perdio());

    }
}
