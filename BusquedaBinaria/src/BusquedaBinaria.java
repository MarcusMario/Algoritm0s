/*
    BusquedaBinaria
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(log n)
    La complejidad espacial es O(1)

 */

public class BusquedaBinaria {

    public static int buscar(int[] lista, int valor) {
        int inicio = 0;
        int fin = lista.length - 1;

        while (inicio <= fin) {
            int centro = (inicio + fin) / 2;

            if (lista[centro] == valor) {
                return centro;
            }

            if (lista[centro] < valor) {
                inicio = centro + 1;
            } else {
                fin = centro - 1;
            }
        }

        return -1;
    }
}
