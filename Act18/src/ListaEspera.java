import java.util.PriorityQueue;

public class ListaEspera {
    public static void main(String[] args) {
        PriorityQueue<Urgencia> listaDeEspera = new PriorityQueue<>(Urgencia.COMPARATOR_PRIORIDAD);
        listaDeEspera.add(new Urgencia(5, "a", new Paciente("Pepe", 41)));
        listaDeEspera.add(new Urgencia(9, "a", new Paciente("Alonso", 15)));
        listaDeEspera.add(new Urgencia(2, "a", new Paciente("Chema", 25)));
        listaDeEspera.add(new Urgencia(1, "a", new Paciente("Paz", 34)));
        listaDeEspera.add(new Urgencia(7, "a", new Paciente("Carlota", 19)));
        System.out.println(listaDeEspera);
    }
}
