public class Actividad
{
private Asignatura currentAsignatura;
private String descripcion;

public Actividad (Asignatura currentAsignatura, String descripcion)
{
    this.currentAsignatura = currentAsignatura;
    this.descripcion = descripcion;
    currentAsignatura.addActividad(new Actividad(currentAsignatura, descripcion));
}

    @Override
    public String toString() {
        return "Actividad{" +
                "currentAsignatura=" + currentAsignatura +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
