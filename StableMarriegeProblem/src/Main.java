import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, List<String>> preferenciasA = new HashMap<>();
        preferenciasA.put("A1", Arrays.asList("B1", "B2", "B3"));
        preferenciasA.put("A2", Arrays.asList("B2", "B1", "B3"));
        preferenciasA.put("A3", Arrays.asList("B1", "B2", "B3"));

        Map<String, List<String>> preferenciasB = new HashMap<>();
        preferenciasB.put("B1", Arrays.asList("A3", "A1", "A2"));
        preferenciasB.put("B2", Arrays.asList("A1", "A2", "A3"));
        preferenciasB.put("B3", Arrays.asList("A1", "A2", "A3"));

        Map<String, String> resultado = MatrimonioEstable.matrimonioEstable(preferenciasA, preferenciasB);

        System.out.println("Parejas estables: " + resultado);
    }
}


