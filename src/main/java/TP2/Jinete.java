package TP2;

import Excepciones.ErrorAutoAtaque;


public class Jinete extends NoCura {

    private EstadoJinete estado;

    public Jinete (Coordenada coordenadaUnidad) {
        this.vida = new Vida(100);
        this.costo = 3;
        this.danioCuerpoACuerpo = 5;
        this.danioADistancia = 15;
        this.coordenada = coordenadaUnidad;

    }

    public void atacar(Unidad otraUnidad) throws ErrorAutoAtaque {
        if (this.enemigosCercanos.size()!=0 && this.aliadosCercanos.size()==0) {
            estado = new EstadoJineteEspada();
        } else {
            estado = new EstadoJineteArcoYFlecha();
        }
        estado.atacar(this, otraUnidad);
    }

    public void recibirInvitacionABatallon(Batallon unBatallon){
        return;
    }
}
