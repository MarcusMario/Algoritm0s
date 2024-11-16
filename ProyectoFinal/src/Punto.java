import java.awt.*;

public class Punto {

    float x, y;


    Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    void dibujar(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval((int) x - 5, (int) y - 5, 10, 10);
    }
}
