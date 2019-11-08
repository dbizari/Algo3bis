package TP2;

import java.util.ArrayList;

public class Fila {

    private ArrayList<Celda> celdas;

    public Fila(int cantCol){
        this.celdas = new ArrayList<Celda>();
        for(int i = 0; i < cantCol; ++i) {
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