import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(6);
        lista.add(9);
        lista.add(1);
        lista.add(7);
        lista.add(3);
        lista.add(4);
        lista.add(2);
        lista.add(0);
        lista.add(5);

        System.out.println("Lista Original: " + lista);

        ArrayList<Integer> listaOrdenada = BucketSort.bucketSort(lista);

        System.out.println("Lista Ordenada: " + listaOrdenada);
    }
}
