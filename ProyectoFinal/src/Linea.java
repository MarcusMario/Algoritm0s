import java.awt.*;
import java.util.Random;

public class Linea {

    Punto A, B;

    Linea(Punto A, Punto B) {
        this.A = A;
        this.B = B;
    }

    void dibujar(Graphics g) {
        g.setColor(new Color(new Random().nextInt(0xFFFFFF)));
        g.drawLine((int) A.x, (int) A.y, (int) B.x, (int) B.y);
    }
}
