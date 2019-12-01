public class Tecnico extends Empleado {

    public Tecnico(String nombre, String DNI, int productividad) {
        super(nombre, DNI, productividad);
    }

    @Override

    public void setSueldo(int sueldo) {
        sueldo = 900;
        super.setSueldo(sueldo);
    }

    @Override
    public int getSueldo() {
        return super.getSueldo();
    }
}
