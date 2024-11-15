public class Main {

    public static void main(String[] args) {
        int[] arreglo = {34, 7, 23, 32, 5, 62};

        System.out.println("Arreglo antes de ordenar:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }

        QuickSort.quicksort(arreglo, 0, arreglo.length - 1);

        System.out.println("\nArreglo después de ordenar:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}
