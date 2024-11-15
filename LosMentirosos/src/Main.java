import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<String> respuestasIniciales = Arrays.asList("v", "v", "v", "f", "f", "f", "v", "f", "v");

        String resultadoFinal = LosMentirosos.losMentirosos(respuestasIniciales);

        System.out.println("Resultado final: " + resultadoFinal);
    }


}
