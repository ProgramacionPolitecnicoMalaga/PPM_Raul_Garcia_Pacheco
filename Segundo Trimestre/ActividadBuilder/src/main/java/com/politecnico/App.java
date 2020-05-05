package com.politecnico;

import com.politecnico.Builder.HabitacionBuilder;
import com.politecnico.Builder.HabitacionDirector;
import com.politecnico.Producto.Habitacion;

import java.util.Scanner;

public class App 
{
    public static Habitacion habitacion;

    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Elija un Pack para su Habitación:\n" +
                "    1- Pack básico\n" +
                "    2- Pack romance\n" +
                "    3- Pack familiar\n" +
                "    4- Pack padres relajados\n" +
                "    5- Pack deluxe\n" +
                "    6- Pack deluxe familiar");

        int tipoHabitacion = teclado.nextInt();

        HabitacionBuilder builder = new HabitacionBuilder();
        HabitacionDirector director = new HabitacionDirector(builder);

        switch (tipoHabitacion)
        {
            case 1: habitacion = director.packBasico(); break;
            case 2: habitacion = director.packRomance(); break;
            case 3: habitacion = director.packFamiliar(); break;
            case 4: habitacion = director.packPadresRelajados(); break;
            case 5: habitacion = director.packDeluxe(); break;
            case 6: habitacion = director.packDeluxeFamiliar(); break;
        }

        System.out.println(habitacion);
    }
}
