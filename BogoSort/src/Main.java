import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        Lista Desordenada
         */
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(5);
        lista.add(1);
        lista.add(4);
        lista.add(2);


        System.out.println("Lista original: " + lista);

        ArrayList<Integer> listaOrdenada = BogoSort.bogoSort(lista);


        System.out.println("Lista ordenada: " + listaOrdenada);
    }
}
