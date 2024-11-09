/*
    En base al ejercicio hecho en clase se entiende que el cálculo del factorial de un número consiste en multiplicar el número dado por todos los números enteros positivos menores que él, hasta llegar a 1.
    Así funciona el algoritmo para calcular el factorial:

    1. Dado un número entero positivo n, inicializamos el resultado del factorial como 1 (es decir, factorial = 1).
    2. Multiplicamos factorial por cada número desde 1 hasta n.
    3. Al finalizar las multiplicaciones, el valor de factorial será el factorial de n.

    Por ejemplo, el factorial de 5 se calcula como 5!=5×4×3×2×1=1205!=5×4×3×2×1=120.

    
    ****COSTO COMPUTACIONAL****

    La complejidad temporal del cálculo factorial es O(n), ya que implica un bucle que recorre desde 1 hasta n.
    La complejidad espacial es O(1), pues solo se requiere una variable adicional para almacenar el resultado.

    Ejemplo: 5
    Salida: 120


 */




import java.math.BigInteger;

public class CalcularFactorial {

    public BigInteger calcular(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
