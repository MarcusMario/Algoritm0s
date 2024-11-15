/*
    MergeSort
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(n log n)
    La complejidad espacial es O(n)

 */
public class MergeSort {

    public static void mergeSort(int[] lista) {
        if (lista.length > 1) {
            int mitad = lista.length / 2;
            int[] izquierda = new int[mitad];
            int[] derecha = new int[lista.length - mitad];

            System.arraycopy(lista, 0, izquierda, 0, mitad);
            System.arraycopy(lista, mitad, derecha, 0, lista.length - mitad);

            mergeSort(izquierda);
            mergeSort(derecha);

            merge(lista, izquierda, derecha);
        }
    }

    public static void merge(int[] lista, int[] izquierda, int[] derecha) {
        int i = 0, j = 0, k = 0;

        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] < derecha[j]) {
                lista[k++] = izquierda[i++];
            } else {
                lista[k++] = derecha[j++];
            }
        }

        while (i < izquierda.length) {
            lista[k++] = izquierda[i++];
        }

        while (j < derecha.length) {
            lista[k++] = derecha[j++];
        }
    }
}
