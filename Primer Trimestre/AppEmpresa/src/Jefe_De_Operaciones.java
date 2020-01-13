public class Jefe_De_Operaciones extends Empleado{
    public Jefe_De_Operaciones(String nombre, String DNI, int productividad) {
        super(nombre, DNI, productividad);
    }

    @Override
    public void setSueldo(int sueldo) {
        sueldo = 3500;
        super.setSueldo(sueldo);
    }

    @Override
    public int getSueldo() {
        return super.getSueldo();
    }
}
