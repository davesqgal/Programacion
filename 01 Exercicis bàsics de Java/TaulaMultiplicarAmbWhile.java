// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class TaulaMultiplicarAmbWhile {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quina es la taula de multiplicar que vols? ");
        int taula = sc.nextInt();

        System.out.println("Açi tens la taula del " + taula);

        int contador = 1;

        // Açi he usat el while com a condicio. Mentre contador siga menor que 11, el bucle continua.

        while (contador < 11) {
            int multi = taula * contador;
            System.out.println(contador + "x" + taula + "= " + multi);
            contador ++;
            
        }
        sc.close();
    }
}
