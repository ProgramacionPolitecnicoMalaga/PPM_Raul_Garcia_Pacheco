import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Establecimiento> todosLosEstablecimientos = new ArrayList<>();
    private static ArrayList<Plato> todosLosPlatos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static String stringTeclado;
    private static double LATITUD_ACTUAL= 43.060017;
    private static double LONGITUD_ACTUAL= -2.493796;
    private static LectorXML lectorXML = new LectorXML("C:\\Users\\rauli\\Desktop\\Módulo\\Programación\\Examen_RaulGarciaPacheco\\src\\establecimientos.xml");
    private static CrunchifyCSVtoArrayList lectorCSV = new CrunchifyCSVtoArrayList();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, XPathExpressionException, IOException {
        while(lectorXML.hasNext()) todosLosEstablecimientos.add(lectorXML.next());
        lectorCSV.leerCSV("C:\\Users\\rauli\\Desktop\\Módulo\\Programación\\Examen_RaulGarciaPacheco\\src\\platos.csv",todosLosPlatos);


        todosLosPlatos.add(new Plato("a", "b", "Tolosa"));
        todosLosEstablecimientos.get(0).getPlatosEnEstablecimiento().add(new Plato("a","b", "Tolosa"));
        System.out.println(todosLosEstablecimientos.get(0).getPlatosEnEstablecimiento() );

       /* todosLosEstablecimientos.add(new Establecimiento("a", "c1", 12, 2));
        todosLosEstablecimientos.add(new Establecimiento("b", "c1", 30, 21));
        todosLosEstablecimientos.add(new Establecimiento("c", "c3", 6, -2));

        todosLosPlatos.add(new Plato("p1", "d1", "c1"));
        todosLosPlatos.add(new Plato("p2", "d2", "c1"));

        todosLosPlatos.get(1).getEstoyEn().add(todosLosEstablecimientos.get(1));

        todosLosEstablecimientos.get(0).getPlatosEnEstablecimiento().add(todosLosPlatos.get(0));
        todosLosEstablecimientos.get(0).getPlatosEnEstablecimiento().add(todosLosPlatos.get(1));
        todosLosEstablecimientos.get(1).getPlatosEnEstablecimiento().add(todosLosPlatos.get(0));
        todosLosEstablecimientos.get(1).getPlatosEnEstablecimiento().add(todosLosPlatos.get(1));*/

        interfazInicial();

    }


    public static void interfazInicial() {
        System.out.println("¿Qué desea realizar?");
        System.out.println("1- Establecimientos en una Ciudad");
        System.out.println("2- Platos típicos de una Ciudad");
        System.out.println("3- Buscar establecimiento por Ciudad y Plato");
        System.out.println("4- Establecimiento más cercano para un plato en específico");
        System.out.println("5- Carta de un establecimiento");
        System.out.println("6- Nuevo plato típico");
        System.out.println("7- Nuevo establecimiento con sus platos");

        stringTeclado = scanner.nextLine();
        int seleccion = Integer.parseInt(stringTeclado);

        if (seleccion == 1) {
            System.out.println("\n");
            interfazInicial1();
        }

        if (seleccion == 2) {
            System.out.println("\n");
            interfazInicial2();
        }

        if (seleccion == 3) {
            System.out.println("\n");
            interfazInicial3();
        }

        if (seleccion == 4) {
            System.out.println("\n");
            interfazInicial4();
        }

        if (seleccion == 5) {
            System.out.println("\n");
            interfazInicial5();
        }

        if (seleccion == 6) {
            System.out.println("\n");
            interfazInicial6();
        }

        if (seleccion == 7) {
            System.out.println("\n");
            interfazInicial7();
        }
    }

    public static void interfazInicial1() {
        System.out.println("¿Qué ciudad?");
        stringTeclado = scanner.nextLine();
        System.out.println("\n");
        System.out.println("Establecimientos: ");
        for (int i = 0; i < todosLosEstablecimientos.size(); i++) {
            if (stringTeclado.equals(todosLosEstablecimientos.get(i).getCiudad())) {
                System.out.println(todosLosEstablecimientos.get(i));
            }
        }

        System.out.println("\n");
        interfazInicial();
    }

    public static void interfazInicial2() {
        System.out.println("¿Qué ciudad?");
        stringTeclado = scanner.nextLine();
        System.out.println("\n");
        System.out.println("Platos: ");
        for (int i = 0; i < todosLosPlatos.size(); i++) {
            if (stringTeclado.equals(todosLosPlatos.get(i).getCiudad())) {
                System.out.println(todosLosPlatos.get(i));
            }
        }

        System.out.println("\n");
        interfazInicial();
    }

    public static void interfazInicial3() {
        System.out.println("¿Qué ciudad?");
        String ciudad = scanner.nextLine();
        System.out.println("\n");
        ArrayList<Plato> platosII3 = new ArrayList<>();
        System.out.println("Platos disponibles: ");
        ArrayList<Establecimiento> establecimientosII3 = new ArrayList<>();
        for (int i = 0; i < todosLosPlatos.size(); i++) {
            if (ciudad.equals(todosLosPlatos.get(i).getCiudad())) {
                platosII3.add(todosLosPlatos.get(i));
                System.out.println(todosLosPlatos.get(i));
            }
        }

        System.out.println("\n");
        System.out.println("¿Qué Plato?");

        String plato = scanner.nextLine();

        System.out.println("\n");
        System.out.println("Establecimientos: ");
        for (int i = 0; i < platosII3.size(); i++) {
            if (plato.equals(platosII3.get(i).getNombre())) {
                System.out.println(platosII3.get(i).getEstoyEn().toString());
            }
        }

        System.out.println("\n");
        interfazInicial();
    }

    public static void interfazInicial4() {
        System.out.println("¿Qué plato?");
        System.out.println(todosLosPlatos);
        stringTeclado = scanner.nextLine();
        double distancia = Double.MAX_VALUE;
        ArrayList<Establecimiento> establecimientosII4 = new ArrayList<Establecimiento>();
        Establecimiento establecimientoII4 = null;

        for (int i = 0; i<todosLosEstablecimientos.size(); i++)
        {
            for (int x = 0; x < todosLosEstablecimientos.get(i).getPlatosEnEstablecimiento().size(); x++)
            {
                if (stringTeclado.equals(todosLosEstablecimientos.get(i).getPlatosEnEstablecimiento().get(x).getNombre()))
                {
                    establecimientosII4.add(todosLosEstablecimientos.get(i));
                }
            }
        }

        for (int i = 0; i > establecimientosII4.size(); i++) {
            double dist = calcularDistancia(todosLosEstablecimientos.get(i).getLongitud(),LONGITUD_ACTUAL, todosLosEstablecimientos.get(i).getLatitud(), LATITUD_ACTUAL);
            if(dist < distancia)
            {
                distancia = dist;
                establecimientoII4 = todosLosEstablecimientos.get(i);
            }
        }
        System.out.println("Establecimiento más cercano: ");
        System.out.println(establecimientoII4);
        System.out.println("\n");
        interfazInicial();
    }

    public static double calcularDistancia(double lon1, double lon2, double lat1, double lat2) {
        double theta = lon1 - lon2;
        double dist = Math.sin(Math.toRadians(lat1)) *
                Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) *
                Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
        dist = Math.acos(dist);
        dist = Math.toDegrees(dist);
        dist = dist * 60 * 1.853159616;
        return dist;
    }

    public static void interfazInicial5()
    {
        System.out.println(todosLosEstablecimientos);
        System.out.println("¿Qué establecimiento?");
        stringTeclado = scanner.nextLine();
        Establecimiento establecimientoII5 = null;

        for (int i = 0; i<todosLosEstablecimientos.size();i++)
        {
            if (stringTeclado.equals(todosLosEstablecimientos.get(i).getNombre()))
            {
                establecimientoII5 = todosLosEstablecimientos.get(i);
            }
        }
        if(establecimientoII5.getPlatosEnEstablecimiento().size()>0)
        System.out.println(establecimientoII5.getPlatosEnEstablecimiento());
        else
        {
            System.out.println("Este establecimiento no tiene platos");
        }
        System.out.println("\n");
        interfazInicial();
    }

    public static void interfazInicial6()
    {
        añadirPlato();
        System.out.println("\n");
        interfazInicial();

    }

    public static Plato añadirPlato()
    {
        String nombre;
        String descripcion;
        String ciudad;

        System.out.println("¿Cuál es el nombre del nuevo plato?");
        nombre = scanner.nextLine();

        System.out.println("\n");
        System.out.println("¿Cuál es su descripción?");
        descripcion = scanner.nextLine();

        System.out.println("\n");
        System.out.println("¿A qué ciudad pertenece?");
        ciudad = scanner.nextLine();

        Plato plato = new Plato(nombre,descripcion,ciudad);
        todosLosPlatos.add(plato);

        System.out.println("\n");
        System.out.println("Su nuevo plato es: ");
        System.out.println(plato.toString2());
        return plato;
    }

    public static void interfazInicial7()
    {
        String nombre;
        String ciudad;
        double latitud;
        double longitud;

        System.out.println("¿Cuál es el nombre del nuevo establecimiento?");
        nombre = scanner.nextLine();
        System.out.println("\n");

        System.out.println("¿A qué ciudad pertecene?");
        ciudad = scanner.nextLine();
        System.out.println("\n");

        System.out.println("¿Cuál es su latitud?");
        latitud = Double.parseDouble(scanner.nextLine());
        System.out.println("\n");

        System.out.println("¿Cuál es su longitud?");
        longitud = Double.parseDouble(scanner.nextLine());
        System.out.println("\n");

        Establecimiento establecimiento = new Establecimiento(nombre, ciudad, latitud, longitud);
        System.out.println("\n");


        boolean no = false;
        int z = Integer.MAX_VALUE;
        int respuesta;
        for (int i = 0; i<z && no==false; i++) {
            System.out.println("¿Desea añadir un plato? 0(No)/1(Si)");
            respuesta = Integer.valueOf(scanner.nextLine());
            if(respuesta == 0)
            {
                System.out.println("\n");
                System.out.println("Su nuevo establecimiento es: ");
                System.out.println(establecimiento.toString2());
                interfazInicial();
                System.out.println("\n");
            }

            if (respuesta == 1)
            {
                System.out.println("\n");
                Plato plato = añadirPlato();
                establecimiento.getPlatosEnEstablecimiento().add(plato);
                todosLosPlatos.add(plato);
                plato.getEstoyEn().add(establecimiento);
                System.out.println("\n");
            }
        }

    }
}