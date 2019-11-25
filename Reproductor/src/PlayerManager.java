import java.util.LinkedList;

public class PlayerManager {
    public static void main(String[] args) {
        XMLSongsReader xmlSongReader = new XMLSongsReader();
        LinkedList<Cancion> songList = new LinkedList<>();
        while (xmlSongReader.hasNext())
        {
            songList.add(xmlSongReader.next());
        }
        ListaDeReproduccion listaDeReproduccion = new ListaDeReproduccion();
    }
}
