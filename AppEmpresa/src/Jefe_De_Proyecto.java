public class Jefe_De_Proyecto extends Empleado {
    public Jefe_De_Proyecto(String nombre, String DNI, int productividad) {
        super(nombre, DNI, productividad);
    }

    @Override
    public void setSueldo(int sueldo) {
        sueldo = 2500;
        super.setSueldo(sueldo);
    }

    @Override
    public int getSueldo() {
        return super.getSueldo();
    }
}
