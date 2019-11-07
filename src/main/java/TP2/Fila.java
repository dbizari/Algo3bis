package TP2;

import java.util.List;

public class Fila{

    private List<Celda> celdas;

    public void fila(){
        for(int i = 0; i < 10; ++i) {
            celdas.add(new Celda());
        }
    }
}