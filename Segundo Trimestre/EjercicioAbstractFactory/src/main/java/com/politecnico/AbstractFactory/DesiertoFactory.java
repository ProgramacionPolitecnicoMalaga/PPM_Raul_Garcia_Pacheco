package com.politecnico.AbstractFactory;

public class DesiertoFactory implements AbstractFactory{
    @Override
    public String nombre() {
        return "Desierto";
    }

    @Override
    public Jugador crearJugador() {
        return new Jugador("Patton");
    }

    @Override
    public Villano crearVillano() {
        return new Villano("Rommel");
    }

    @Override
    public Obstaculo crearObstaculo() {
        return new Obstaculo("Tanques");
    }
}
