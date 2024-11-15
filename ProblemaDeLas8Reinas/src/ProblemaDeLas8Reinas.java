/*
    ProblemaDeLas8Reinas
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(8!) debido a las 8 reinas
    La complejidad espacial es O(8) ya que es una matrix 8x8

    -- utilice un constructor y diversos Metodos para solucionar este algoritmo--

 */
public class ProblemaDeLas8Reinas {

    private int[][] tablero;
    private boolean detenerBusqueda;

    public ProblemaDeLas8Reinas() {
        this.tablero = new int[8][8];
        this.detenerBusqueda = false;
    }

    public int[][] copiar(int[][] contenido) {
        int[][] copia = new int[8][8];
        for (int i = 0; i < 8; i++) {
            System.arraycopy(contenido[i], 0, copia[i], 0, 8);
        }
        return copia;
    }

    public boolean esValido(int fila, int col) {
        for (int i = 0; i < 8; i++) {
            if (tablero[fila][i] == 1) {
                return false;
            }
            if (tablero[i][col] == 1) {
                return false;
            }
            if (fila + i < 8 && col + i < 8 && tablero[fila + i][col + i] == 1) {
                return false;
            }
            if (fila - i >= 0 && col - i >= 0 && tablero[fila - i][col - i] == 1) {
                return false;
            }
            if (fila + i < 8 && col - i >= 0 && tablero[fila + i][col - i] == 1) {
                return false;
            }
            if (fila - i >= 0 && col + i < 8 && tablero[fila - i][col + i] == 1) {
                return false;
            }
        }
        return true;
    }

    public void crearHijos(int n) {
        if (n == 8) {
            System.out.println("Resultado encontrado:");
            for (int[] fila : tablero) {
                for (int casilla : fila) {
                    System.out.print(casilla + " ");
                }
                System.out.println();
            }
            System.out.println("\n");
            detenerBusqueda = true;
            return;
        }

        for (int i = 0; i < 8; i++) {
            if (esValido(n, i)) {
                int[][] tableroHijo = copiar(tablero);
                tableroHijo[n][i] = 1;
                ProblemaDeLas8Reinas hijo = new ProblemaDeLas8Reinas();
                hijo.tablero = tableroHijo;
                hijo.crearHijos(n + 1);
                if (detenerBusqueda) {
                    return;
                }
            }
        }
    }

}
