import javax.swing.*;
import java.util.ArrayList;

public class Producto {
    private String id;
    private int cantidad;
    ArrayList<Componente> compNecesarios;

    public Producto (String id)
    {
        this.id = id;
        compNecesarios = new ArrayList<>();
    }

    public ArrayList<Componente> getCompNecesarios() {
        return compNecesarios;
    }

    public void setNecesario(Componente necesario)
    {
        compNecesarios.add(necesario);
    }
}
