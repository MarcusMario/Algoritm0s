import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un rango: ");
        int rango = scanner.nextInt();

        for (int i = 0; i <= rango; i++) {
            System.out.println("Fibonacci(" + i + ") = " + Fibonacci.fibonacci(i));
        }

        scanner.close();
    }


}
