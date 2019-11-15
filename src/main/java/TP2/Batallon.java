package TP2;

import java.util.ArrayList;
import java.util.List;

public class Batallon {
    private List<SoldadoInfanteria> soldados;

    public Batallon(){
        soldados = new ArrayList<SoldadoInfanteria>();
    }

    public void unirSoldado(SoldadoInfanteria unSoldado){
        if(soldados.size() >= 3){
            return;
        }
        soldados.add(unSoldado);
    }

    public boolean sePuedeMover(){
        return soldados.size() == 3;
    }

    public boolean sePudoUnir(Unidad unaUnidad) {
        return !soldados.isEmpty();
        //return soldados.contains(unaUnidad); //Puede fallar a modo de una primera version solo se verificara que no
        // este vacia la coleccion
    }

    public void moverBatallon(SoldadoInfanteria soldadoInfanteria) {
       // for (SoldadoInfanteria soldado : soldados) {
          //  soldado.coordenada. //Cambio coordenada de la unidad pero con este modelo no podemos actualizar la celda!!!
        //}
    }
}
