import java.util.LinkedList;

public class Jugador {
    private int color;
    private String nombreJugador;
    private static int casillaActual;
    private LinkedList<Casilla> tablero;
    private LinkedList<Casilla> historial;
    private Dado dado;


    public static void main(String[] args) {
        Jugador verde = new Jugador(1, "Verde", 0);
        verde.avanzarACasilla();
        verde.avanzarACasilla();
        verde.avanzarACasilla();
        verde.avanzarACasilla();
        verde.historial();
        verde.retrocederACasilla();
        verde.historial();
    }

    public Jugador(int color, String nombreJugador, int casillaActual)
    {
    this.casillaActual = casillaActual;
    this.nombreJugador = nombreJugador;
    this.color = color;
        tablero = new LinkedList<>();
        historial = new LinkedList<>();
        dado = new Dado();
        casillaActual = 0;
    }

    public void avanzarACasilla()
    {
    this.casillaActual = casillaActual;
    casillaActual +=dado.tirarDado(1,6);
    historial.addFirst(new Casilla(casillaActual));
    }

    public void retrocederACasilla()
    {
        this.casillaActual = casillaActual;
        casillaActual -=historial.peekFirst().getNumeroCasilla();
        historial.removeFirst();
        System.out.println("Retrocede");
    }

    public void historial()
    {
        System.out.println("===================================================");
    for(int i = 0; i<historial.size(); i++)
    {
        System.out.println(historial.get(i).getNumeroCasilla());
    }
        System.out.println("===================================================");
    }

    public void undo()
    {

    }

    public void redo()
    {

    }
}
