import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Alumno> alumnosCurso;
    private ArrayList<Asignatura> asignaturasCurso;

    public Curso (String nombre, ArrayList alumnosCurso, ArrayList asignaturasCurso)
    {
        this.nombre = nombre;
        this.asignaturasCurso = asignaturasCurso;
        this.alumnosCurso = alumnosCurso;
    }
    public Curso(String nombre)
    {
        this.nombre = nombre;
        this.alumnosCurso = new ArrayList<>();
        this.asignaturasCurso = new ArrayList<>();
    }

    public void setAlumnosCurso(ArrayList<Alumno> alumnosCurso) {
        this.alumnosCurso = alumnosCurso;
    }

    public void setAsignaturasCurso(ArrayList<Asignatura> asignaturasCurso) {
        this.asignaturasCurso = asignaturasCurso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addAlumno(Alumno alumno)
    {
       alumnosCurso.add(alumno);
    }

    public void addAsignatura(Asignatura asignatura)
    {
        asignaturasCurso.add(asignatura);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Asignatura> getAsignaturasCurso() {
        return asignaturasCurso;
    }

    public ArrayList<Alumno> getAlumnosCurso() {
        return alumnosCurso;
    }

    @Override
    public String toString() {
        return "Curso :" + nombre;
    }

    public String getAttribute(String nombre) {
        return nombre;
    }
}
