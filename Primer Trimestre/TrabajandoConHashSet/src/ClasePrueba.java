public class ClasePrueba {
    private int numero;
    private String cadena;

    public ClasePrueba(int numero, String cadena) {
        this.numero = numero;
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "ClasePrueba{" +
                "numero=" + numero +
                ", cadena='" + cadena + '\'' +
                '}';
    }

    @Override
    public int hashCode()
    {
        return cadena.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return cadena.equals(((ClasePrueba) obj).getCadena());
    }
}
