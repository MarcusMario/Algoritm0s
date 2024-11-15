/*
    TourDelCaballo
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(n^2)
    La complejidad espacial es  O(n^2)

 */

public class TourDelCaballo {

    static final int N = 8;

    static int[] movimientosX = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] movimientosY = {1, 2, 2, 1, -1, -2, -2, -1};

    public static boolean esValido(int x, int y, int[][] tablero) {
        return (x >= 0 && x < N && y >= 0 && y < N && tablero[x][y] == -1);
    }

    public static boolean resolverTour(int x, int y, int movimiento, int[][] tablero) {
        if (movimiento == N * N) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int siguienteX = x + movimientosX[i];
            int siguienteY = y + movimientosY[i];

            if (esValido(siguienteX, siguienteY, tablero)) {
                tablero[siguienteX][siguienteY] = movimiento;
                if (resolverTour(siguienteX, siguienteY, movimiento + 1, tablero)) {
                    return true;
                }
                tablero[siguienteX][siguienteY] = -1;
            }
        }
        return false;
    }

    public static void tourDelCaballo() {
        int[][] tablero = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                tablero[i][j] = -1;
            }
        }

        tablero[0][0] = 0;

        if (resolverTour(0, 0, 1, tablero)) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(tablero[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("No se pudo encontrar una solución.");
        }
    }

}