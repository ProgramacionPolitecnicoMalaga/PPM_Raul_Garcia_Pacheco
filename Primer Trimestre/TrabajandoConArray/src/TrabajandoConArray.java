import java.util.ArrayList;

public class TrabajandoConArray {
    public static void main(String[] args) {
        ArrayList<ClaseDePrueba> array = new ArrayList<>();
        array.add(new ClaseDePrueba(1,"e1"));
        array.add(new ClaseDePrueba(2,"e2"));
        array.add(new ClaseDePrueba(3,"e3"));
        array.add(new ClaseDePrueba(4,"e4"));
        System.out.println(array.toString());
    }
}
