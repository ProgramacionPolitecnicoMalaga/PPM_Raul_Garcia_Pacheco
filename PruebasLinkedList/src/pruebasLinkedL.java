import javax.swing.text.Element;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class pruebasLinkedL {
    public static final String YELLOW = "\033[0;33m";
    public static final String GREEN = "\033[0;32m";
    public static LinkedList<ElementoTest> lList = new LinkedList<>();
    public static void main(String[] args) {
        añadir(new ElementoTest(1));
        añadir(new ElementoTest(2));
        añadir(new ElementoTest(3));

        mostrar();
        sacar();
        mostrar();
        sacar();
        mostrar();
    }

    public static void añadir(ElementoTest nuevo)
    {
        lList.addLast(nuevo);
    }

    public static void sacar()
    {
      lList.pollLast();
    }

    public static void mostrar()
    {
        System.out.println(GREEN + "==========================================================================");
        System.out.println(YELLOW + lList.toString());
        System.out.println(GREEN + "==========================================================================");
    }
}

/*
add
addFirst
addLast

remove
removeFirst
removeLast

element - devuelve el primer elemento

peek - devuelve y no borra
peekFirst
peekLast

poll
pollFirst - devuelve y borra
pollLast

indexOf()
 */