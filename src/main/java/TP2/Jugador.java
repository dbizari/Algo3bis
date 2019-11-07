package TP2;

import java.io.PrintStream;
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
        try {
            puntos.descontarPuntos(unidad.getCosto());
        } catch (Excepciones.PuntosInsuficientesException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        unidades.add(unidad);
    }

    public int getSector() {
        return sector;
    }

    public boolean perdio(){
        return unidades.size() == 0;
    }

    public void atacarUnidad (Unidad unidad) {

        Brujula brujula = new Brujula();

        for (int i = 0; i < unidades.size(); i++){

            if (brujula.ubicacionEsIgual(unidades.get(i).getCoordenadas(), unidad.getCoordenadas())){
                unidades.remove(i);
                return;
            }
        }
    }

}
