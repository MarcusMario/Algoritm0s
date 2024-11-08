/*
    Así es como funciona el algoritmo Bubble Sort en base a lo visto en clase:

    1. Empezamos comparando los dos primeros elementos del array. Si el primer elemento es mayor que el segundo
    elemento, los intercambiamos.
    2. Luego comparamos el segundo y el tercer elemento. Si el segundo elemento es mayor que el tercero,
    los intercambiamos.
    3. Continuamos este proceso hasta llegar al final del array. En este punto, el elemento más grande estará
    al final de la matriz.
    4. Luego repetimos los pasos 1 a 3 para la parte restante sin ordenar de la matriz hasta que toda la matriz esté ordenada.

    ****COSTO COMPUTACIONAL****

    La complejidad temporal de Bubble Sort es O(n^2) en el peor y promedio caso, y O(n) en el mejor caso cuando
    la matriz de entrada ya está ordenada.

    La complejidad espacial es O(1) ya que Bubble Sort opera en la matriz de entrada en el lugar.

    La ordenación de burbuja es O(n) en una lista que ya está ordenada, es decir, el mejor caso

    Ejemplo: [2, 1, 9, 3, 5, 4, 0]
    Salida: [0 1 2 3 4 5 9]


 */


public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Recorre todos los elementos del array
        for (int i = 0; i < n - 1; i++) {
            // Los ultimos elementos  i ya estan en su lugar
            for (int j = 0; j < n - i - 1; j++) {
                // Intercambia elementos adyacentes si estan en el orden incorrecto
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
