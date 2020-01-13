public class Empleado {
    private String nombre, DNI;
    private int sueldo, productividad;

    public Empleado (String nombre, String DNI, int productividad)
    {
        this.nombre = nombre;
        this.DNI = DNI;
        this.productividad = productividad;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }
}
