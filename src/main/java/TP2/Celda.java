package TP2;

import Excepciones.CeldaOcupada;
import Excepciones.ErrorAutoAtaque;
import Excepciones.ErrorNoHayUnidadAtacante;
import Excepciones.NoPuedeCurar;

public class Celda {

    private boolean ocupada;
    private Unidad unidad;
    protected int sector;

    public Celda(int sector){
        ocupada = false;
        this.sector = sector;
    }

    public Unidad getUnidad() {

        if(unidad != null) {
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
        this.ocupada = true;
    }

    private void celdaEstaOcupadaPorEnemigo(Celda celda) throws ErrorAutoAtaque {
        if (this.unidad.getDueño() == celda.getUnidad().getDueño() ) {
            throw new ErrorAutoAtaque();
        }
    }

    public boolean esDeSectorAliado(Jugador jugador) {
        return this.sector == jugador.getSector();
    }

    public void atacar(Celda celdaEnemiga) throws ErrorAutoAtaque, ErrorNoHayUnidadAtacante {
        celdaEstaOcupadaPorEnemigo(celdaEnemiga);
        if(!estaOcupada()) {
            throw new ErrorNoHayUnidadAtacante();
        }
        if(!celdaEnemiga.estaOcupada()) {
            return; //Ataca igual a la nada (se termina su turno)
        }
        if(!esDeSectorAliado(this.unidad.getDueño())){
            this.unidad.atacarConPenalizacion(celdaEnemiga.getUnidad());
        }
        this.unidad.atacar(celdaEnemiga.getUnidad());
    }

    public void curar(Celda celdaLastimada) throws NoPuedeCurar {
        this.unidad.curar(celdaLastimada.getUnidad());
    }

    public void vaciar() {
        ocupada = false;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Celda){
            Celda c = (Celda) o;
            if(this.unidad.equals(c.unidad))
                return true;
        }
        return false;
    }
}

