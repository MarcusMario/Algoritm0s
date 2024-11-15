/*
    Dijkstra
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(V+E)
    La complejidad espacial es  O(V+E)

 */
import java.util.*;

public class Dijkstra {

    public static Map<String, Map<String, Integer>> grafo = new HashMap<>();

    public static void dijkstra(String inicio, String destino) {
        Map<String, Integer> distancias = new HashMap<>();
        Map<String, String> predecesores = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

        for (String vertice : grafo.keySet()) {
            distancias.put(vertice, Integer.MAX_VALUE);
        }
        distancias.put(inicio, 0);
        pq.add(inicio);

        while (!pq.isEmpty()) {
            String verticeActual = pq.poll();

            if (verticeActual.equals(destino)) break;

            for (Map.Entry<String, Integer> vecino : grafo.get(verticeActual).entrySet()) {
                String vecinoVertice = vecino.getKey();
                int peso = vecino.getValue();

                int nuevaDistancia = distancias.get(verticeActual) + peso;

                if (nuevaDistancia < distancias.get(vecinoVertice)) {
                    distancias.put(vecinoVertice, nuevaDistancia);
                    predecesores.put(vecinoVertice, verticeActual);
                    pq.add(vecinoVertice);
                }
            }
        }

        System.out.println("Distancias más cortas desde el nodo: " + inicio);
        for (Map.Entry<String, Integer> entry : distancias.entrySet()) {
            System.out.println("Distancia a " + entry.getKey() + ": " + (entry.getValue() == Integer.MAX_VALUE ? "Inaccesible" : entry.getValue()));
        }

        List<String> ruta = reconstruirRuta(predecesores, inicio, destino);
        if (ruta != null) {
            System.out.println("Ruta más corta hacia " + destino + ": " + String.join(" -> ", ruta));
        } else {
            System.out.println("No hay ruta disponible hacia el destino.");
        }
    }

    public static List<String> reconstruirRuta(Map<String, String> predecesores, String inicio, String destino) {
        List<String> ruta = new LinkedList<>();
        String actual = destino;

        if (!predecesores.containsKey(destino)) {
            return null;
        }

        while (actual != null) {
            ruta.add(actual);
            actual = predecesores.get(actual);
        }

        if (!ruta.contains(inicio)) {
            return null;
        }

        Collections.reverse(ruta);
        return ruta;
    }

}
