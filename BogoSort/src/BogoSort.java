/*
    BogoSort
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O((n+1)!)
    La complejidad espacial es O(n)

 */

import java.util.ArrayList;
import java.util.Collections;

public class BogoSort {


    public static boolean orden(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> bogoSort(ArrayList<Integer> lista) {
        int intentos = 0;
        while (!orden(lista)) {
            intentos++;
            Collections.shuffle(lista);
            System.out.println("Intento " + intentos + ": " + lista);
        }
        return lista;
    }

}
