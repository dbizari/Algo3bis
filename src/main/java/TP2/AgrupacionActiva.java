package TP2;

public class AgrupacionActiva extends Agrupacion {

    public AgrupacionActiva(){
        super();
    }

    public void unirMiembro(Unidad unMiembro){
        if(miembros.size() >= 3){
            return;
        }
        miembros.add(unMiembro);
    }

    public void moverBatallon(Unidad unidad) {
        //for (Unidad uni : miembros) {
            //TODO Ver como resolver
        //}
    }
}
