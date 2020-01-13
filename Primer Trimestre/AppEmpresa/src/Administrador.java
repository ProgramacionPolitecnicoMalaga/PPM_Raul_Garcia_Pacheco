public class Administrador extends Empleado {
    public Administrador(String nombre, String DNI, int productividad) {
        super(nombre, DNI, productividad);
    }

    @Override
    public void setSueldo(int sueldo) {
        sueldo = 1400;
        super.setSueldo(sueldo);
    }

    @Override
    public int getSueldo() {
        return super.getSueldo();
    }
}
