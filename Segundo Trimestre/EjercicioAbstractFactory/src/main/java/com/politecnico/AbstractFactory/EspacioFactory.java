package com.politecnico.AbstractFactory;

public class EspacioFactory implements AbstractFactory{

    @Override
    public String nombre() {
        return "Espacio";
    }

    @Override
    public Jugador crearJugador() {
        return new Jugador("USS Enterprise");
    }

    @Override
    public Villano crearVillano() {
        return new Villano("Khan");
    }

    @Override
    public Obstaculo crearObstaculo() {
        return new Obstaculo("Naves Klingon");
    }
}
