import java.util.ArrayList;

public class Empleado {
    public ArrayList<Integer> ventas;
    public String nombre;

    public Empleado(String nombre, ArrayList ventas)
    {
        this.nombre = nombre;
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return nombre+"\n";
    }
}
