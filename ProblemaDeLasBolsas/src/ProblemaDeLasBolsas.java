/*
    ProblemaDeLasBolsas - Bin Packing
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(n)
    La complejidad espacial es O(K)

 */
import java.util.ArrayList;

public class ProblemaDeLasBolsas {

    public static int nextFit(int[] objetos, int capacidad) {
        ArrayList<Integer> bins = new ArrayList<>();
        int binCapacidad= capacidad;

        for (int objeto : objetos) {
            if (objeto <= binCapacidad) {
                binCapacidad -= objeto;
            } else {
                bins.add(binCapacidad);
                binCapacidad = capacidad - objeto;
            }
        }

        bins.add(binCapacidad);
        return bins.size();
    }

}