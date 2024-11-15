/*
    ProblemaDeLaMochila - Knapsack Problem
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(n*C)
    La complejidad espacial es O(n*C)

 */
public class ProblemaDeLaMochila {

    public static int mochila(int capacidad, int[][] elementos, int n) {

        int[][] tabla = new int[n + 1][capacidad + 1];

        for (int i = 1; i <= n; i++) {
            int peso = elementos[i - 1][0];
            int valor = elementos[i - 1][1];
            for (int w = 0; w <= capacidad; w++) {
                if (peso <= w) {
                    tabla[i][w] = Math.max(valor + tabla[i - 1][w - peso], tabla[i - 1][w]);
                } else {
                    tabla[i][w] = tabla[i - 1][w];
                }
            }
        }

        return tabla[n][capacidad];
    }
}
