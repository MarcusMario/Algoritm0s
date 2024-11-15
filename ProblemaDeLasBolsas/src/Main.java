public class Main {

    public static void main(String[] args) {
        int[] objetos = {4, 8, 1, 4, 2, 1};
        int capacidad = 10;
        int numBins = ProblemaDeLasBolsas.nextFit(objetos, capacidad);
        System.out.println("Número total de contenedores utilizados: " + numBins);
    }
}
