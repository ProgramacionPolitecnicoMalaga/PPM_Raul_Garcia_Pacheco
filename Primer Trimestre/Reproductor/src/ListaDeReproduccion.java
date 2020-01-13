import java.util.LinkedList;
import java.util.ListIterator;

public class ListaDeReproduccion {
    private LinkedList<Cancion> listaDeReproduccion;

    private static final int ESTADO_NO_INICIADO = 0;
    private static final int ESTADO_REPRODUCIENDO=1;
    private static final int ESTADO_DETENIDO=2;
    private static final int ESTADO_REPRODUCCION_ALEATORIA=3;
    private static  final int ESTADO_FINALIZADO = 4;
    private int status;
    private ListIterator<Cancion> listIterator;
    private Player player;

    public ListaDeReproduccion(LinkedList<Cancion> listaDeReproduccion)
    {
        listIterator = listaDeReproduccion.listIterator();
        player = new Player();
        this.listaDeReproduccion = listaDeReproduccion;
        status = ESTADO_NO_INICIADO;
    }

    public void iniciar()
    {
        switch (status){
            case ESTADO_NO_INICIADO:
               iniciarEstadoReproduccion();
                break;

            case ESTADO_FINALIZADO:
                listIterator = listaDeReproduccion.listIterator();
                iniciarEstadoReproduccion();

            default:
                System.out.println("Operación no permitida");
        }
    }

    private void iniciarEstadoReproduccion() {
        if(listIterator.hasNext())
        {
            player.play(listIterator.next());
            status = ESTADO_REPRODUCIENDO;
        }
    }

    /*
    -Iniciar
    -Detener
    -AñadirSiguiente
    -Anterior
    -Siguiente
    -Pausar
    -Aleatorio
     */
}
