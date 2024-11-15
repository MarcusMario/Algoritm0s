public class Main {

    public static void main(String[] args) {
        int[] listaOrdenada = {5, 9, 3, 1, 7, 4, 2, 6, 8, 10};

        System.out.println("Lista antes de ordenar:");
        for (int num : listaOrdenada) {
            System.out.print(num + " ");
        }

        MergeSort.mergeSort(listaOrdenada);

        System.out.println("\nLista después de ordenar:");
        for (int num : listaOrdenada) {
            System.out.print(num + " ");
        }
    }
}
