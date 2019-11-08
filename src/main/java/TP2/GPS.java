package TP2;

import Excepciones.ErrorAutoAtaque;

import java.util.ArrayList;

public class GPS {

    private int maxDistanciaCercana = 2;
    private int maxDistanciaMedia = 5;

    /*public boolean ubicacionEsIgual (ArrayList<Integer> coordenadas1, ArrayList<Integer> coordenadas2) {
        if (coordenadas1.size() != coordenadas2.size()) {
            return false;
        }
        for (int i= 0; i < coordenadas1.size(); i++) {
            if(coordenadas1.get(i) != coordenadas2.get(i)) {
                return false;
            }
        }
        return true;
    } */

    public boolean estanADistanciaCercana(Unidad unidad1, Unidad unidad2) {
        ArrayList<Integer> coordenadas1 = unidad1.getCoordenadas();
        int x1 = coordenadas1.get(0);
        int y1 = coordenadas1.get(1);
        ArrayList<Integer> coordenadas2 = unidad2.getCoordenadas();
        int x2 = coordenadas2.get(0);
        int y2 = coordenadas2.get(1);

        /*if(moduloDiferencia(x1,x2) == 0 && moduloDiferencia(y1,y2) == 0){
            throw new ErrorAutoAtaque();
        }*/ // HAY QUE VERIFICAR QUE NO SEA UN AUTOATAQUE PORQUE SERIA UN BUG

        if( moduloDiferencia(x1, x2) <= maxDistanciaCercana && moduloDiferencia(y1, y2) <= maxDistanciaCercana) {
            return true;
        } else {
            return false;
        }
    }

    public int moduloDiferencia(int n1, int n2) {
        if ((n1-n2) > 0) {
            return n1-n2;
        }
        return n2-n1;
    }

}
