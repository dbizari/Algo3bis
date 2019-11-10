package TP2;

import org.junit.Test;

public class SoldadosTest {
    @Test
    public void test3soldadosContiguosSeMuevenJuntosEnLaMismaDireccion(){
        AlgoChess juego = new AlgoChess(20,20);
        juego.agregarJugador("wola", 1);
        try{
            juego.colocarSoldadoInfanteriaPara("wola",2,2);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
