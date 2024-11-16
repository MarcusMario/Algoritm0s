/*
    ProyectoFinal
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(n)
    La complejidad espacial es  O(n)
    
    En este ejercicio use SWING y AWT para mejorar el resultado visual.
    implementando atributos, constructores y los metodos necesarios.

 */

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class GenerarPuntos extends JPanel {

    private ArrayList<Punto> nube;
    private ArrayList<Linea> lineas;
    private int numPuntos = 100;


    public GenerarPuntos() {
        nube = new ArrayList<>();
        lineas = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < numPuntos; i++) {
            nube.add(new Punto(random.nextInt(1200) + 50, random.nextInt(700) + 50));
        }

        conectarPuntos();
    }

    private void conectarPuntos() {
        for (int i = 0; i < nube.size() - 1; i++) {
            Punto A = nube.get(i);
            Punto B = nube.get(i + 1);
            lineas.add(new Linea(A, B));
        }
        Punto A = nube.getLast();
        Punto B = nube.getFirst();
        lineas.add(new Linea(A, B));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);

        for (Punto p : nube) {
            p.dibujar(g);
        }for (Linea linea : lineas) {
            linea.dibujar(g);
        }

        dibujarLineaDivisoria(g);
    }

    private void dibujarLineaDivisoria(Graphics g) {
        float centroY = 0;
        for (Punto p : nube) {
            centroY += p.y;
        }
        centroY /= nube.size();

        g.setColor(Color.RED);
        g.drawLine(0, (int) centroY, getWidth(), (int) centroY);
    }
}