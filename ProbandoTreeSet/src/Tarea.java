import java.util.Comparator;

public class Tarea {
    private String descripcion;
    private int prioridad;

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                ", COMPARATOR_PRIORIDAD=" + COMPARATOR_DESCRIPCION +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        return ((Tarea) obj).getDescripcion().equals(descripcion);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static final Comparator<Tarea> COMPARATOR_DESCRIPCION = new Comparator<Tarea>() {
        @Override
        public int compare(Tarea o1, Tarea o2) {
            return o1.getDescripcion().compareTo(o2.getDescripcion());
        }
    };

    public static final Comparator<Tarea> COMPARATOR_PRIORIDAD = new Comparator<Tarea>() {
        @Override
        public int compare(Tarea o1, Tarea o2) {
            return o1.getPrioridad()-o2.getPrioridad();
        }
    };
}
