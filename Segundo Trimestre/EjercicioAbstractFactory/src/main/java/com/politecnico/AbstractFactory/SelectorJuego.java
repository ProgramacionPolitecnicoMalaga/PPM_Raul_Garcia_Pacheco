package com.politecnico.AbstractFactory;

import java.util.Scanner;

public class SelectorJuego {
    Scanner teclado = new Scanner(System.in);
    int num;
    AbstractFactory Factoria = null;
    public void Selector()
    {
        System.out.println("Pulse:\n" +
                "    1-Para Jugar en la Selva.\n" +
                "    2-Para Jugar en el Desierto. \n" +
                "    3-Para Jugar en el Espacio.");

        num = teclado.nextInt();

        switch (num) {
            case 1: Factoria = new SelvaFactory();
            break;
            case 2: Factoria = new DesiertoFactory();
            break;
            case 3: Factoria = new EspacioFactory();
        }
        MostrarJuego(Factoria);
    }

    public void MostrarJuego(AbstractFactory Juego)
    {
        System.out.println("Su Juego consta de las siguientes partes:\n" +
                "    ESCENARIO --> "+Juego.nombre()+" \n" +
                "    JUGADOR --> "+Juego.crearJugador().getNombre()+" \n" +
                "    VILLANO --> "+Juego.crearVillano().getNombre()+"\n" +
                "    OBSTACULO --> "+Juego.crearObstaculo().getNombre()+"");
    }
}