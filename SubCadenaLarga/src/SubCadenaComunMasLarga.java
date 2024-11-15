/*
    SubCadenaLarga
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(n*m)
    La complejidad espacial es  O(m)

 */

public class SubCadenaComunMasLarga {


    public static String subcadenaComunMasLarga(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int[] dp = new int[m + 1];
        int longitudMaxima = 0;
        int indiceFinal = 0;

        for (int i = 1; i <= n; i++) {
            int[] dpAnterior = dp.clone();
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[j] = dpAnterior[j - 1] + 1;
                    if (dp[j] > longitudMaxima) {
                        longitudMaxima = dp[j];
                        indiceFinal = i;
                    }
                } else {
                    dp[j] = 0;
                }
            }
        }

        return str1.substring(indiceFinal - longitudMaxima, indiceFinal);
    }
}
