import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //Monitorizar la fabricación de productos, para que cada vez que se fabrica un nuevo producto se actualice el inventario de componentes.
        // Tras fabricar un cierto producto, si quedan menos unidades de las necesarias para fabricar 10 productos, se debe generar un mensaje informando de la escasez de dicho componente.

        Producto p1 = new Producto("P1");
        Producto p2 = new Producto("P2");

        p1.setNecesario(new Componente("C1", 7));
        p1.setNecesario(new Componente("C2", 10));
        p1.setNecesario(new Componente("C3", 4));


        Inventario inventario = new Inventario();
        inventario.leerXML("C:\\Users\\rauli\\Desktop\\Módulo\\Programación\\Actividad3Repaso\\src\\inventario.xml");

        ArrayList<Componente> escasos = inventario.minimasExistencias(p1);

        while (escasos.size() ==0)
        {
            inventario.contabilizarProducto(p1);
            escasos = inventario.minimasExistencias(p1);
        }

        if(escasos.size()>0)
        {
            System.out.println("NO QUEDAN EXISTENCIAS DE LOS SIGUIENTES PRODUCTOS");
        }
        System.out.println(escasos);
        System.out.println(inventario);

        Inventario inventario2 = new Inventario();
        inventario2.leerXML("C:\\Users\\rauli\\Desktop\\Módulo\\Programación\\Actividad3Repaso\\src\\inventario.xml");
        System.out.println(inventario2);

        inventario2.escribirXML("C:\\Users\\rauli\\Desktop\\Módulo\\Programación\\Actividad3Repaso\\src\\inventario2.xml");
        System.out.println(inventario2);
    }
}
