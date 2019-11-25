import java.util.HashSet;
import java.util.Iterator;

public class ProbandoHashSet {
    public static void main(String[] args) {
        HashSet<ClasePrueba> hashSet = new HashSet<>();

        hashSet.add(new ClasePrueba(1,"c1"));
        hashSet.add(new ClasePrueba(1,"c1"));
        hashSet.add(new ClasePrueba(2,"c1"));
        hashSet.add(new ClasePrueba(2,"c2"));
        hashSet.add(new ClasePrueba(1,"c2"));
        hashSet.add(new ClasePrueba(3,"c3"));
        hashSet.add(new ClasePrueba(4,"c4"));
        hashSet.add(new ClasePrueba(5,"c5"));
        hashSet.add(new ClasePrueba(6,"c6"));
        hashSet.add(new ClasePrueba(7,"c7"));


        System.out.println(hashSet);
        System.out.println(hashSet.contains(new ClasePrueba(200,"c2")));

        Iterator<ClasePrueba> it = hashSet.iterator();

        while(it.hasNext())
            System.out.println(it.next());
        hashSet.forEach(n -> { System.out.println(n);});
    }
}
