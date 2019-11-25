import java.util.HashMap;
import java.util.Iterator;

public class ProbandoHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Tarea> mapa = new HashMap<Integer, Tarea>();

        mapa.putIfAbsent(1,new Tarea("A", 1));
        mapa.putIfAbsent(1,new Tarea("A", 1));
        mapa.putIfAbsent(1,new Tarea("B", 2));

        Iterator<Integer> it = mapa.keySet().iterator();
        Iterator<Tarea> it2 = mapa.values().iterator();
        while(it.hasNext())
        {
            Integer clave = it.next();
            System.out.println("Clave: " + clave);
            Tarea tarea = mapa.get(clave);
            System.out.println("Tarea: " + tarea.getDescripcion());
        }

      //  System.out.println(mapa);
    }
}
