public class Programador extends Empleado {
    public Programador(String nombre, String DNI, int productividad) {
        super(nombre, DNI, productividad);
    }

    @Override
    public void setSueldo(int sueldo) {
        sueldo = 1800;
        super.setSueldo(sueldo);
    }

    @Override
    public int getSueldo() {
        return super.getSueldo();
    }
}
