import java.util.Comparator;

public class Urgencia {
    private String descripcion;
    private int especialidad;
    private Paciente paciente;

    public Urgencia (int especialidad, String descripcion, Paciente paciente)
    {
        this.especialidad = especialidad;
        this.descripcion = descripcion;
        this.paciente = paciente;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public static final Comparator<Urgencia> COMPARATOR_PRIORIDAD = new Comparator<Urgencia>() {
        @Override
        public int compare(Urgencia p1, Urgencia p2) {
            return p1.getEspecialidad()-p2.getEspecialidad();
        }
    };

    @Override
    public String toString() {
        return "Urgencia{" +
                "descripcion='" + descripcion + '\'' +
                ", especialidad=" + especialidad +
                ", paciente=" + paciente +
                '}' + "\n";
    }
}
