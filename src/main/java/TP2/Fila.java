package TP2;

import java.util.List;

public class Fila {

    private List<Celda> celdas;

    public Fila(Integer cantCol){
        for(Integer i = 0; i < cantCol; ++i) {
            celdas.add(new Celda());
        }
    }

    public Celda getCelda(int numeroColumna){
        return celdas.get(numeroColumna-1);
    }

    public int getCantColumnas() {
        return celdas.size();
    }
}