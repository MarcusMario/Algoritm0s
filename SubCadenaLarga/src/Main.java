public class Main {
    public static void main(String[] args) {
        String str1 = "aabcccdeucac";
        String str2 = "aabcabacba";
        String resultado = SubCadenaComunMasLarga.subcadenaComunMasLarga(str1, str2);
        System.out.println("La subcadena común más larga es: " + resultado);
    }
}
