public class Caja implements Comparable<Caja> {

    int h, w, d;

    public Caja(int h, int w, int d) {
        this.h = h;
        this.w = w;
        this.d = d;
    }

    @Override
    public int compareTo(Caja otra) {
        return Integer.compare(this.d * this.w, otra.d * otra.w);
    }
}
