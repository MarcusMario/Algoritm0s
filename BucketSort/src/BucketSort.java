/*
    BucketSort
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(n)
    La complejidad espacial es O(n)

 */
import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static ArrayList<Integer> bucketSort(ArrayList<Integer> lista) {
            ArrayList<ArrayList<Integer>> cubetas = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                cubetas.add(new ArrayList<>());
            }

            for (int numero : lista) {
                int index = numero / 10;
                cubetas.get(index).add(numero);
            }

            ArrayList<Integer> listaOrdenada = new ArrayList<>();

            for (ArrayList<Integer> cubeta : cubetas) {
                Collections.sort(cubeta);
                listaOrdenada.addAll(cubeta);
            }

            return listaOrdenada;
    }
}
