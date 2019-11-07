package TP2;

import org.junit.Assert;
import org.junit.Test;

public class JugadorTest {

    @Test (expected = PuntosInsuficientesException.class)
    public void testSoloPuedeUsarUnidadesSiTienePuntos () {
        Jugador jugador = new Jugador();
        Unidad unidad1 = new Jinete();
        Unidad unidad2 = new Jinete();
        Unidad unidad3 = new Jinete();
        Unidad unidad4 = new Jinete();
        Unidad unidad5 = new Jinete();
        Unidad unidad6 = new Jinete();
        Unidad unidad7 = new SoldadoInfanteria();
        Unidad unidad8 = new SoldadoInfanteria();
        Unidad unidad9 = new SoldadoInfanteria();
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
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        Unidad unidad1 = new Jinete();
        Unidad unidad2 = new Jinete();
        Unidad unidad3 = new Jinete();
        Unidad unidad4 = new Jinete();
        Unidad unidad5 = new Jinete();
        Unidad unidad6 = new Jinete();
        Unidad unidad7 = new SoldadoInfanteria();
        Unidad unidad8 = new SoldadoInfanteria();
        Unidad unidad9 = new SoldadoInfanteria();
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
