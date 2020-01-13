import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private Curso currentCurso;
    private ArrayList<Actividad> actividadesAsignatura;

    public Asignatura(String nombre, Curso currentCurso, ArrayList actividadesAsignatura)
    {
        this.currentCurso = currentCurso;
        this.actividadesAsignatura = actividadesAsignatura;
        this.nombre = nombre;
    }

    public Asignatura(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void addActividad(Actividad actividad)
    {
      actividadesAsignatura.add(actividad);
    }

    @Override
    public String toString() {
        return "Asignatura: "+ nombre;
    }
}
