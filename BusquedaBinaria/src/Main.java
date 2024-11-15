
public class Main {

    public static void main(String[] args) {
        int[] datos = {-8, 4, 5, 9, 12, 18, 25, 40, 60, 100, 220};

        int resultado = BusquedaBinaria.buscar(datos, 40);

        if (resultado == -1) {
            System.out.println("El valor no se encuentra en la lista.");
        } else {
            System.out.println("El valor se encuentra en el índice: " + resultado);
        }
    }
}
