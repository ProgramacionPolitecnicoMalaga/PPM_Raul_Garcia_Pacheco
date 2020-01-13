import java.util.Objects;

public class Componente {
    private String id;
    private int cantidad;

    public Componente(String id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Componente that = (Componente) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Componente{" +
                "id='" + id + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
