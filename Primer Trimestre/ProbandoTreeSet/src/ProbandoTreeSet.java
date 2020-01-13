import java.util.TreeSet;

public class ProbandoTreeSet {
    private static TreeSet<Tarea> tareas;
    public static void main(String[] args) {
        tareas = new TreeSet<>(Tarea.COMPARATOR_DESCRIPCION);

        tareas.add(new Tarea("B", 3));
        tareas.add(new Tarea("A", 1));
        tareas.add(new Tarea("C", 2));

        print(tareas);

        tareas.add(new Tarea("B",-27));
        tareas.add(new Tarea("C",5));

        print(tareas);
    }

    public static void print (TreeSet<Tarea> tarea)
    {
        System.out.println("====================================");
        System.out.println(tarea);
        System.out.println("====================================");
    }
}
