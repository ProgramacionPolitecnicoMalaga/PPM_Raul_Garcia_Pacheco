package com.politecnico.AbstractFactory;

public class SelvaFactory implements AbstractFactory {


    @Override
    public String nombre() {
        return "Selva";
    }

    @Override
    public Jugador crearJugador() {
        return new Jugador("Indiana");
    }

    @Override
    public Villano crearVillano() {
        return new Villano("Molaram");
    }

    @Override
    public Obstaculo crearObstaculo() {
        return new Obstaculo("Carcelero Turco");
    }
}
