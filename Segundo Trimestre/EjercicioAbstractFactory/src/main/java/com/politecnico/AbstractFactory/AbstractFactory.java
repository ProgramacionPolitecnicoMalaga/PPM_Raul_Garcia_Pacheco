package com.politecnico.AbstractFactory;

public interface AbstractFactory {
 String nombre();
 public Jugador crearJugador();
 public Villano crearVillano();
 public Obstaculo crearObstaculo();
}
