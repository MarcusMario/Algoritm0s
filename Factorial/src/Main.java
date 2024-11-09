import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CalcularFactorial calculadora = new CalcularFactorial();

        System.out.print("Ingresa un número: ");
        int n = leer.nextInt();

        if (n < 0) {
            System.out.println("El factorial no se puede calcular para números negativos.");
        } else {
            BigInteger resultado = calculadora.calcular(n);
            System.out.println("El factorial de " + n + " es: " + resultado);
        }

        leer.close();
    }
}
