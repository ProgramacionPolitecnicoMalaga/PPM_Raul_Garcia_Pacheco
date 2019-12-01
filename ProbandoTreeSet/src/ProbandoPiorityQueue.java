import java.util.Iterator;
import java.util.PriorityQueue;

public class ProbandoPiorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Tarea> tareas = new PriorityQueue<Tarea>(Tarea.COMPARATOR_PRIORIDAD);

        tareas.add(new Tarea("Boca", 3));
        tareas.add(new Tarea("Avión", 1));
        tareas.add(new Tarea("Casa", 2));
        tareas.add(new Tarea("Beef",-27));
        tareas.add(new Tarea("Cosa",5));



        Iterator<Tarea> it = tareas.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void print (PriorityQueue<Tarea> tarea)
    {
        System.out.println("====================================");
        System.out.println(tarea);
        System.out.println("====================================");
    }
}
