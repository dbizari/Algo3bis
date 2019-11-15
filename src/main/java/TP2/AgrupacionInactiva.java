package TP2;

public class AgrupacionInactiva extends Agrupacion {
    public AgrupacionInactiva(){
        super();
    }
    public void unirMiembro(Unidad unaUnidad){
        if(miembros.size() >= 1) return;
        miembros.add(unaUnidad);
    }
}
