/*
    LosMentirosos
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(n)
    La complejidad espacial es  O(n)

 */
import java.util.ArrayList;
import java.util.List;

public class LosMentirosos {

    public static List<String> agruparParejas(List<String> respuestas) {
        List<String> parejas = new ArrayList<>();
        for (int i = 0; i < respuestas.size(); i += 2) {
            if (i + 1 < respuestas.size()) {

                parejas.add(respuestas.get(i) + respuestas.get(i + 1));
            } else {

                parejas.add(respuestas.get(i));
            }
        }
        return parejas;
    }

    public static List<String> filtrarParejas(List<String> parejas) {
        List<String> nuevoGrupo = new ArrayList<>();
        for (String pareja : parejas) {
            if (pareja.length() == 2) {

                if (pareja.equals("vv")) {
                    nuevoGrupo.add("v");
                } else if (pareja.equals("ff")) {
                    nuevoGrupo.add("f");
                }
            } else if (pareja.equals("v")) {

                nuevoGrupo.add("v");
            }
        }
        return nuevoGrupo;
    }

    public static String losMentirosos(List<String> respuestas) {
        while (respuestas.size() > 1) {

            List<String> parejas = agruparParejas(respuestas);

            respuestas = filtrarParejas(parejas);

            if (respuestas.isEmpty()) {
                return "f";
            }
        }
        return respuestas.get(0);
    }
}
