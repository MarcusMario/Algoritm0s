import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Grafos
        Dijkstra.grafo.put("A", Map.of("B", 1, "C", 4));
        Dijkstra.grafo.put("B", Map.of("A", 1, "C", 2, "D", 5, "E", 3));
        Dijkstra.grafo.put("C", Map.of("A", 4, "B", 2, "D", 1));
        Dijkstra.grafo.put("D", Map.of("B", 5, "C", 1, "E", 2, "F", 3));
        Dijkstra.grafo.put("E", Map.of("B", 3, "D", 2, "F", 1, "G", 5));
        Dijkstra.grafo.put("F", Map.of("D", 3, "E", 1, "G", 2));
        Dijkstra.grafo.put("G", Map.of("E", 5, "F", 2));

        String verticeInicio = "A";
        String verticeDestino = "G";
        Dijkstra.dijkstra(verticeInicio, verticeDestino);
    }
}
