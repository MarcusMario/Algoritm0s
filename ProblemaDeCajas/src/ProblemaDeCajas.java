/*
    ProblemaDeCajas
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(n^2)
    La complejidad espacial es O(n)

 */
import java.util.Arrays;
import java.util.Collections;

public class ProblemaDeCajas {

    public static int alturaMaximaApilamiento(Caja[] arr, int n) {
        Caja[] rot = new Caja[3 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            rot[index] = new Caja(arr[i].h, Math.max(arr[i].d, arr[i].w), Math.min(arr[i].d, arr[i].w));
            index++;
            rot[index] = new Caja(arr[i].w, Math.max(arr[i].h, arr[i].d), Math.min(arr[i].h, arr[i].d));
            index++;
            rot[index] = new Caja(arr[i].d, Math.max(arr[i].h, arr[i].w), Math.min(arr[i].h, arr[i].w));
            index++;
        }

        Arrays.sort(rot, Collections.reverseOrder());

        int[] msh = new int[3 * n];

        for (int i = 0; i < 3 * n; i++) {
            msh[i] = rot[i].h;
        }

        for (int i = 1; i < 3 * n; i++) {
            for (int j = 0; j < i; j++) {
                if (rot[i].w < rot[j].w && rot[i].d < rot[j].d) {
                    msh[i] = Math.max(msh[i], msh[j] + rot[i].h);
                }
            }
        }

        int maxm = -1;
        for (int i = 0; i < 3 * n; i++) {
            maxm = Math.max(maxm, msh[i]);
        }

        return maxm;
    }

}
