package TP2;

import org.junit.Assert;
import org.junit.Test;

public class EntidadesTest {
    @Test
    public void testUnidadMovibleSePuedeMoverEnTodasLasDirecciones(){
        Unidad unidad = new SoldadoInfanteria();
        Ubicacion ubicacion = unidad.getUbicacion();

        unidad.mover(0,1); //TODO ver como manejar el tema de las direcciones en el movimiento

        Assert.assertEquals(unidad.getUbicacion(),ubicacion + loQueMeMovi);
    }

    @Test
    public void testUnidadMovibleNoPuedeMoverseACasilleroOcupado(){}

    @Test
    public void testSoldadoInfanteriaAliadoAtacaPiezaEnemigaSeVerificaQueRestaLoCorrespondiente(){
        SoladoInfanteria si1 = new SoldadoInfanteria(); //TODO ajustar ubicacion, y determinar aliado
        SoldadoInfanteria si2 = new SoldadoInfanteria(); //TODO ajustar ubicacion, y determinar enemigo

        si1.atacar(si2);

        Assert.assertEquals(21123,si2.getVida()); //TODO calcular cuanta deberia ser la vida despues del ataque
    }

    @Test
    public void  testJineteAliadoAtacaPiezaEnemigaSeVerificaQueRestaLaVidaCorrespondiente(){
        Jinete j1 = new Jinete();
        SoldadoInfanteria si1 = new SoldadoInfanteria();

        j1.atacar(si1);

        Assert.assertEquals(123, si1.getVida());
    }

    @Test
    public void testCatapultaAliadaAtacaPiezaEnemigaSeVerificaQueRestaLaVidaCorrespondiente(){
        Catapulta c1 = new Catapulta();
        SoldadoInfanteria si1 = new SoldadoInfanteria();

        c1.atacar(si1);

        Assert.assertEquals(232, si1.getVida());
    }

    @Test
    public void testCuranderoAliadoCuraPiezaAliadaSeVerificaQueSumaLaVidaCorrespondiente(){
        Curandero c = new Curandero();
        SoldadoInfanteria si1 = new SoldadoInfanteria();
        SoldadoInfanteria si2 = new SoldadoInfanteria();

        si1.atacar(si2);
        c.curar(si2);

        Assert.assertEquals(123,si2.getVida());
    }

}
