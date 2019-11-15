package TP2;

import Excepciones.ErrorAutoAtaque;

public class SoldadoInfanteria extends NoCura {
    private Batallon batallon;

    public SoldadoInfanteria(Coordenada coordenadaUnidad){
        this.vida = new Vida(100);
        this.costo = 1;
        this.danioCuerpoACuerpo = 10;
        this.danioADistancia = 0;
        this.coordenada = coordenadaUnidad;
    }

    public void atacar(Unidad unidad) throws ErrorAutoAtaque {
        if(coordenada.estanADistanciaCercana(this, unidad)) {
            unidad.sufrirAtaque(this.danioCuerpoACuerpo);
        } else {
            unidad.sufrirAtaque(this.danioADistancia);
        }
    }

    @Override
    public void recibirInvitacionAAgrupacion(Agrupacion unaAgrupacion){
        unaAgrupacion.unirMiembro(this);
        this.agrupacion = unaAgrupacion; //TODO ver si realmente es necesario que la unidad tenga a la agrupacion como atributo, pensar que capaz sea mejor tener una agrupacion temporal!!!
    }

    @Override
    public void mover(Coordenada coordenada){
        if(this.batallon != null){
            if(this.batallon.sePuedeMover()){
                batallon.moverBatallon(this);
                return;
            }
        }
        this.coordenada = coordenada;
    }

    public Agrupacion getAgrupacion(){
        if(this.agrupacion == null){
            this.agrupacion = new AgrupacionActiva();
            this.agrupacion.unirMiembro(this);
        }
        return this.agrupacion;
    }
}
