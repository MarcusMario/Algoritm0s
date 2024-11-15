/*
    Mastermind
    ****COSTO COMPUTACIONAL****

    La complejidad temporal es de O(n * m)
    La complejidad espacial es  O(n)

 */
import java.util.Scanner;

public class Mastermind {

        private final String codigo;
        private int intentos;


        public Mastermind(String codigo) {
            this.codigo = codigo;
            this.intentos = 0;
        }

        public void iniciar() {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Algoritmo de Mastermind");
            System.out.print("Propuesta inicial: ");
            String propuesta = entrada.nextLine();

            while (!propuesta.equals(codigo)) {
                intentos++;
                Resultado resultado = verificarPropuesta(propuesta);
                System.out.println("Tu propuesta (" + propuesta + ") tiene " +
                        resultado.getAciertos() + " acierto(s) y " +
                        resultado.getCoincidencias() + " coincidencia(s).");
                System.out.print("Proponer otro código: ");
                propuesta = entrada.nextLine();
            }

            intentos++;
            System.out.println("¡Número de intentos: " + intentos + "!");
            System.out.println("¡Felicidades, has adivinado el código!");
            entrada.close();
        }

        private Resultado verificarPropuesta(String propuesta) {
            int aciertos = 0;
            int coincidencias = 0;

            for (int i = 0; i < 4; i++) {
                if (propuesta.charAt(i) == codigo.charAt(i)) {
                    aciertos++;
                } else if (codigo.contains(Character.toString(propuesta.charAt(i)))) {
                    coincidencias++;
                }
            }

            return new Resultado(aciertos, coincidencias);
        }
    }

