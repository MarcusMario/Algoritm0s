public class Main {

    public static void main(String[] args) {
        int[][] elementos = {
                {1, 1},
                {3, 4},
                {4, 5},
                {5, 7}
        };
        int capacidad = 9;
        int n = elementos.length;

        int resultado = ProblemaDeLaMochila.mochila(capacidad, elementos, n);
        System.out.println("El valor máximo que se puede obtener es: " + resultado);
    }
}
