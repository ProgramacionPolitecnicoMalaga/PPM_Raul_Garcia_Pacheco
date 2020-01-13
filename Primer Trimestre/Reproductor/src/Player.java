public class Player {
    public void play(Cancion cancion)
    {
        System.out.println("Reproducciondo Canción: " + cancion.getTitle() + ".");
    }

    public void stop (Cancion cancion)
    {
        System.out.println(cancion.getTitle() + "detenida.");
    }

}
