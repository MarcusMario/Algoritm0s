
/*
    Fibonacci en java usando Recursividad

    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(2n)
    La complejidad espacial es O(n)

 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


}

