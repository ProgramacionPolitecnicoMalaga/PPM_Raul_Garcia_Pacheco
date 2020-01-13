import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private Curso currentCurso;
    private ArrayList<Asignatura> asignaturasAlumno;

    public Alumno(String nombre, Curso currentCurso, ArrayList asignaturasAlumno)
    {
        this.nombre = nombre;
        this.currentCurso = currentCurso;
        this.asignaturasAlumno = asignaturasAlumno;

    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Asignatura> getAsignaturasAlumno() {
        return asignaturasAlumno;
    }

    public void addAsignatura(Asignatura asignatura)
    {
        asignaturasAlumno.add(asignatura);
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre;
    }
}
