package TP2;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

public class Jugador {

    private Puntaje puntos;
    private String nombre;
    private List<Unidad> unidades;
    private int sector;

    public Jugador(String nombre, Integer sector) {
        unidades = new List<Unidad>();
        puntos = new Puntaje();
        this.nombre = nombre;
        this.sector = sector;
    }

    public void colocarUnidad(Unidad unidad) {
        this.puntos.descontarPuntos(unidad.getCosto());
        unidades.add(unidad);
    }

    public int getSector() {
        return sector;
    }

    public boolean perdio(){
        return unidades.size() == 0;
    }

    public void atacarUnidad (Unidad unidad) {

        for (int i=0; i < unidades.size(); i++){
            if (i.getCoordenadas() == unidad.getCoordenadas()): unidades.remove(i);
            break;
        }
    }

}
