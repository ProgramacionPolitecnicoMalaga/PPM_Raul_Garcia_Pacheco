import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Empleado Isabel = new Empleado("Isabel",new ArrayList());
        Empleado Vicente = new Empleado("Vicente",(new ArrayList()));
        Isabel.ventas.add(7);Isabel.ventas.add(7);Isabel.ventas.add(10);Isabel.ventas.add(6);Isabel.ventas.add(4);
        Vicente.ventas.add(4);Vicente.ventas.add(7);Vicente.ventas.add(5);Vicente.ventas.add(4);Vicente.ventas.add(5);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(Isabel); empleados.add(Vicente);
        Interfaz inter = new Interfaz(empleados);

        inter.interfaz();
    }
}
