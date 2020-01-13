import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {
    Scanner teclado = new Scanner(System.in);
    public static ArrayList<Empleado> empleados;
    public int numero;
    public Interfaz(ArrayList<Empleado> empleados)
    {
        this.empleados = empleados;
    }

    public void interfaz()
    {
        System.out.println("1. Empleados que vendieron un número de items.");
        System.out.println("2. Obtener el promedio de ventas de cada uno.");
        System.out.println("3. Averiguar quién ha conseguido el mayor número de ventas en un día.");
        System.out.println("4. Insertar un nuevo empleado y sus ventas.");

        numero = teclado.nextInt();

        switch (numero) {
            case 1:
                interfaz1();
                break;

            case 2:
                interfaz2();
                break;

            case 3:
                interfaz3();
                break;

            case 4:
                interfaz4();
                break;
        }

    }

    public void interfaz1()
    {
        System.out.println("¿Qué numero de items?");
        numero = teclado.nextInt();

        ArrayList<Empleado> si = new ArrayList<>();

        for(int i = 0; i < empleados.size(); i++)
        {
           for (int x = 0; x < empleados.get(i).ventas.size(); x++)
           {
               if (empleados.get(i).ventas.get(x) == numero)
               {
                   si.add(empleados.get(i));
                   x = empleados.get(i).ventas.get(x);
               }
           }
        }

        System.out.println("Los Empleados que vendieron "+ numero + " items fueron:");
        System.out.println(si.toString());
        System.out.println("\n");
        interfaz();
    }

    public void interfaz2()
    {
        double suma = 0;

        System.out.println("Promedio de ventas:");

        for(int i = 0; i < empleados.size(); i++)
        {
            for (int x = 0; x < empleados.get(i).ventas.size(); x++)
            {
                suma += empleados.get(i).ventas.get(x);
            }
            System.out.println(empleados.get(i).toString()+ ": " + (suma/empleados.get(i).ventas.size()) + "\n");
            suma = 0;
        }

        System.out.println("\n");
        interfaz();
    }

    public void interfaz3()
    {
        Empleado mvp = null;
        int alto = 0;
        for(int i = 0; i < empleados.size(); i++)
        {
            for (int x = 0; x < empleados.get(i).ventas.size(); x++)
            {
               if(empleados.get(i).ventas.get(x) > alto)
               {
                   alto = empleados.get(i).ventas.get(x);
                   mvp = empleados.get(i);
               }
            }
        }

        System.out.println(mvp.toString() + "es el vendedor/a de la semana con " +alto+ " ventas.");
        System.out.println("\n");
        interfaz();
    }

    public void interfaz4()
    {
        String nombre = null;

        System.out.println("¿Cómo se llama su empleado?");
        nombre = teclado.nextLine();

        Empleado empleado = new Empleado(nombre, new ArrayList());
        empleados.add(empleado);

        System.out.println("\n");
        interfaz();
    }
}
