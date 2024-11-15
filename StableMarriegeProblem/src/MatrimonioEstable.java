/*
    StableMarriegeProblem
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(n^2)
    La complejidad espacial es  O(n^2)

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatrimonioEstable {

    public static Map<String, String> matrimonioEstable(Map<String, List<String>> preferenciasA, Map<String, List<String>> preferenciasB) {
        List<String> libresA = new ArrayList<>(preferenciasA.keySet());
        Map<String, List<String>> propuestas = new HashMap<>();
        Map<String, String> parejas = new HashMap<>();

        for (String a : preferenciasA.keySet()) {
            propuestas.put(a, new ArrayList<>());
        }

        while (!libresA.isEmpty()) {
            String a = libresA.get(0);
            List<String> listaPreferenciasA = preferenciasA.get(a);

            for (String b : listaPreferenciasA) {
                if (!propuestas.get(a).contains(b)) {
                    propuestas.get(a).add(b);

                    if (!parejas.containsKey(b)) {
                        parejas.put(b, a);
                        libresA.remove(0);
                        break;
                    } else {
                        String otroA = parejas.get(b);
                        List<String> preferenciasBActual = preferenciasB.get(b);

                        if (preferenciasBActual.indexOf(a) < preferenciasBActual.indexOf(otroA)) {
                            parejas.put(b, a);
                            libresA.remove(0);
                            libresA.add(otroA);
                            break;
                        }
                    }
                }
            }
        }
        return parejas;
    }   public static Map<String, String> emparejamientoEstable(Map<String, List<String>> preferenciasA, Map<String, List<String>> preferenciasB) {
        List<String> libresA = new ArrayList<>(preferenciasA.keySet());
        Map<String, List<String>> propuestas = new HashMap<>();
        Map<String, String> parejas = new HashMap<>();


        for (String a : preferenciasA.keySet()) {
            propuestas.put(a, new ArrayList<>());
        }

        while (!libresA.isEmpty()) {
            String a = libresA.get(0);
            List<String> listaPreferenciasA = preferenciasA.get(a);

            for (String b : listaPreferenciasA) {
                if (!propuestas.get(a).contains(b)) {
                    propuestas.get(a).add(b);

                    if (!parejas.containsKey(b)) {
                        parejas.put(b, a);
                        libresA.remove(0);
                        break;
                    } else {
                        String otroA = parejas.get(b);
                        List<String> preferenciasBActual = preferenciasB.get(b);

                        if (preferenciasBActual.indexOf(a) < preferenciasBActual.indexOf(otroA)) {
                            parejas.put(b, a);
                            libresA.remove(0);
                            libresA.add(otroA);
                            break;
                        }
                    }
                }
            }
        }
        return parejas;
    }
}
