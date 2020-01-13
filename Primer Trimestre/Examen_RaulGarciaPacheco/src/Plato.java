import java.util.ArrayList;

public class Plato {
    private String nombre;
    private String descripcion;
    private String ciudad;

    private ArrayList<Establecimiento> estoyEn = new ArrayList<>();

    public Plato(String nombre, String descripcion, String ciudad)
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
    }

    public Plato(String nombre)
    {
        this.nombre = nombre;
    }

    public Plato()
    {}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public ArrayList<Establecimiento> getEstoyEn() {
        return estoyEn;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


    public String toString2() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", estoyEn=" + estoyEn +
                '}';
    }
}
