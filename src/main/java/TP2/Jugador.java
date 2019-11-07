package TP2;

import java.util.ArrayList;

public class Jugador {

    private Puntaje puntos;
    private String nombre;
    private ArrayList<Unidad> unidades;
    private int sector;

    public Jugador(String nombre, Integer sector) {
        unidades = new ArrayList<Unidad>();
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

            if (unidades.get(i).getCoordenadas() == unidad.getCoordenadas()){
                unidades.remove(i);
            }
            break;
        }
    }

}
