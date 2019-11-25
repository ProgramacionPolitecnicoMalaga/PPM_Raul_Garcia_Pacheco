public class ClaseDePrueba {
    private int valor;
    private String color;

    public ClaseDePrueba(int valor, String color)
    {
        this.valor = valor;
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ClaseDePrueba{" +
                "valor=" + valor +
                ", color='" + color + '\'' +
                '}';
    }
}
