package TP2;

import org.junit.Assert;
import org.junit.Test;

public class SoldadosTest {
    @Test
    public void test3soldadosContiguosSeMuevenJuntosEnLaMismaDireccion(){
        AlgoChess juego = new AlgoChess(20,20);
        Celda celda1 = null;
        Celda celda2 = null;
        Celda celda3 = null;

        juego.agregarJugador("wola", 1);
        juego.agregarJugador("malo",2);
        try{
            //Coloco piezas
            juego.colocarSoldadoInfanteriaPara("wola",2,2);
            juego.colocarSoldadoInfanteriaPara("wola",2,1);
            juego.colocarSoldadoInfanteriaPara("wola",2,3);
            //Muevo una pieza
            juego.moverUnidadDesdeHasta(2,1,3,1);
            //Obtengo celdas siguientes
            celda1 = juego.getCelda(3,2);
            celda2 = juego.getCelda(3,1);
            celda3 = juego.getCelda(3,3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        Assert.assertTrue(celda1.estaOcupada());
        Assert.assertTrue(celda2.estaOcupada());
        Assert.assertTrue(celda3.estaOcupada());
    }
}
