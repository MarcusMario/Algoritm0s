public class Main {

    public static void main(String[] args) {
        // Lista de cajas con dimensiones, tal cual como lo vimos en clase
        int[][] C = {
                {2, 1, 3},
                {5, 4, 1},
                {3, 3, 4},
                {2, 7, 3},
                {1, 9, 2},
                {5, 1, 4},
                {7, 7, 3},
                {2, 9, 1},
                {4, 8, 7},
                {3, 7, 9}
        };

        Caja[] arr = new Caja[C.length];
        for (int i = 0; i < C.length; i++) {
            arr[i] = new Caja(C[i][0], C[i][1], C[i][2]);
        }

        int n = arr.length;
        System.out.println("La altura máxima es: " + ProblemaDeCajas.alturaMaximaApilamiento(arr, n));
    }
}
