import java.util.Scanner;

public class App {
    public static Scanner teclado = new Scanner(System.in);
    public static int respuesta;
    public static int unidad;

    public static void main(String[] args) {
        interfaz();
    }

    public static void interfaz()
    {
        System.out.println("¿Qué unidad desea utilizar?");
        System.out.println("\n");
        System.out.println("1. mm.");
        System.out.println("2. cm.");
        System.out.println("3. m.");
        System.out.println("\n");
        System.out.println("Elige una opción:");

        respuesta = teclado.nextInt();

        switch (respuesta)
        {
            case 1:
                unidad=1;
                interfazO();
                break;

            case 2:
                unidad=2;
                interfazO();
                break;

            case 3:
                interfazO();
                unidad=3;
                break;
        }

        System.out.println("\n");
        System.out.println("\n");
    }

    public static void interfazO()
    {
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("\n");
        System.out.println("1. Calcular la hipotenusa de un triángulo a partir de sus catetos.");
        System.out.println("2. Calcular un cateto de un triángulo a partir de el otro cateto y la hipotenusa");
        System.out.println("3. Calcular el área de un triángulo a partir un cateto y la hipotenusa");
        System.out.println("4. Caluclar el área de un triángulo a partir de dos catetos.");
        System.out.println("\n");
        System.out.println("Elige una opción:");

        respuesta = teclado.nextInt();

        switch (respuesta)
        {
            case 1:
                interfazO1(unidad);
                break;

            case 2:
                interfazO2(unidad);
                break;

            case 3:
                interfazO3(unidad);
                break;

            case 4:
                interfazO4(unidad);
                break;
        }
    }

    public static void interfazO1(int uni)
    {
        uni = unidad;
        System.out.println("Indique el Primer Cateto:");
        double cateto1 = teclado.nextDouble();
        System.out.println("\n");
        System.out.println("Indique el Segundo Cateto:");
        double cateto2 = teclado.nextDouble();
        System.out.println("\n");

        double resultado = Math.hypot(cateto1,cateto2);

        switch (uni)
        {
            case 1:
                System.out.println("La Hipotenusa es:" + resultado + " mm");
                break;

            case 2:
                System.out.println("La Hipotenusa es:" + resultado + " cm");
                break;

            case 3:
                System.out.println("La Hipotenusa es:" + resultado + " m");
                break;
        }
        System.out.println("\n");
        System.out.println("\n");

        interfaz();
    }

    public static void interfazO2(int uni)
    {
        uni = unidad;
        System.out.println("Indique el Cateto");
        double cateto = teclado.nextDouble();
        System.out.println("\n");
        System.out.println("Indique la hipotenusa");
        double hipo = teclado.nextDouble();
        System.out.println("\n");

        double resultado = Math.sqrt(Math.pow(hipo,2)-Math.pow(cateto,2));

        switch (uni)
        {
            case 1:
                System.out.println("El Cateto es:" + resultado + " mm");
                break;

            case 2:
                System.out.println("El Cateto es:" + resultado + " cm");
                break;

            case 3:
                System.out.println("El Cateto es:" + resultado + " m");
                break;
        }
        System.out.println("\n");
        System.out.println("\n");

        interfaz();
    }

    public static void interfazO3(int uni)
    {
        uni = unidad;
        System.out.println("Indique el Cateto");
        double cateto1 = teclado.nextDouble();
        System.out.println("\n");
        System.out.println("Indique la hipotenusa");
        double hipo = teclado.nextDouble();
        System.out.println("\n");

        double cateto2 = Math.sqrt(Math.pow(hipo,2)-Math.pow(cateto1,2));
        double resultado = ((cateto1*cateto2)/2);

        switch (uni)
        {
            case 1:
                System.out.println("El Área es:" + resultado + " mm²");
                break;

            case 2:
                System.out.println("El Área es:" + resultado + " cm²");
                break;

            case 3:
                System.out.println("El Área es:" + resultado + " m²");
                break;
        }
        System.out.println("\n");
        System.out.println("\n");

        interfaz();
    }

    public static void interfazO4(int uni)
    {
        uni = unidad;
        System.out.println("Indique el Primer Cateto:");
        double cateto1 = teclado.nextDouble();
        System.out.println("\n");
        System.out.println("Indique el Segundo Cateto:");
        double cateto2 = teclado.nextDouble();
        System.out.println("\n");

        double resultado = ((cateto1*cateto2)/2);

        switch (uni)
        {
            case 1:
                System.out.println("El Área es:" + resultado + " mm²");
                break;

            case 2:
                System.out.println("El Área es:" + resultado + " cm²");
                break;

            case 3:
                System.out.println("El Área es:" + resultado + " m²");
                break;
        }
        System.out.println("\n");
        System.out.println("\n");

        interfaz();
    }
}
