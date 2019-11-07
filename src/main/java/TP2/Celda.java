package TP2;

import Excepciones.CeldaOcupada;
import Excepciones.ErrorAutoAtaque;
import Excepciones.ErrorNoHayUnidadAtacante;

public class Celda {

    private boolean ocupada;
    private Unidad unidad;

    public Celda(){
        ocupada = false;
    }

    public Unidad getUnidad() {

        if(ocupada) {
            return unidad;
        }
        return null;
    }

    public boolean estaOcupada(){
        return ocupada;
    }

    public void colocarUnidad(Unidad unidad) throws CeldaOcupada {
        if(ocupada){
            throw new CeldaOcupada();
        }
        this.unidad = unidad;
        ocupada = true;
    }

    private void esCeldaEnemiga(Celda celda) throws ErrorAutoAtaque {
        if (this.unidad.getDueño().getSector() == celda.getUnidad().getDueño().getSector() ) {
            throw new ErrorAutoAtaque();
        }
    }

    public void atacar(Celda celdaEnemiga) throws ErrorAutoAtaque, ErrorNoHayUnidadAtacante {
        esCeldaEnemiga(celdaEnemiga);
        if(estaOcupada() == false) {
            throw new ErrorNoHayUnidadAtacante();
        }
        if(celdaEnemiga.estaOcupada() == false) {
            return; //Ataca igual a la nada (se termina su turno)
        }
        this.unidad.atacar(celdaEnemiga.getUnidad());
    }

    public void curar(Celda celdaLastimada) {
        this.unidad.curar(celdaLastimada.getUnidad());
    }

    public void vaciar() {
        ocupada = false;
    }
}

