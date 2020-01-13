import java.util.ArrayList;

public class Establecimiento {
    private String nombre;
    private String ciudad;
    private double latitud;
    private double longitud;
    private ArrayList<Plato> platosEnEstablecimiento = new ArrayList<>();

    public Establecimiento(String nombre, String ciudad, double latitud, double longitud)
    {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this. latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public ArrayList<Plato> getPlatosEnEstablecimiento() {
        return platosEnEstablecimiento;
    }


    @Override
    public String toString() {
        return "Establecimiento{" +
                "nombre='" + nombre + "}";
    }


    public String toString2() {
        return "Establecimiento{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", platosEnEstablecimiento=" + platosEnEstablecimiento +
                '}';
    }
}
