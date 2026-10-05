// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class TaulaMultiplicar {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quina es la taula de multiplicar que vols? ");
        int taula = sc.nextInt();

        System.out.println("Açi tens la taula del " + taula);

        // Este exercici esta fet amb el for. Esta el mateix exercici pero cambiant for per while.

        for (int contador = 1; contador < 11; contador++) {
            int multi = taula * contador;
            System.out.println(contador + "x" + taula + "= " + multi);
            
        }
        sc.close();
    }
}
