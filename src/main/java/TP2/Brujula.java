package TP2;

import java.util.ArrayList;

public class Brujula {

    public boolean ubicacionEsIgual (ArrayList<Integer> coordenadas1, ArrayList<Integer> coordenadas2) {
        if (coordenadas1.size() != coordenadas2.size()) {
            return false;
        }
        for (int i= 0; i < coordenadas1.size(); i++) {
            if(coordenadas1.get(i) != coordenadas2.get(i)) {
                return false;
            }
        }
        return true;
    }
}
