// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class SumaParells {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("De quin numero vols traure el parells?: ");
        int numero = sc.nextInt();
        int suma = 0;

        for (int parells = 0; parells <= numero; parells++) {
            if (parells % 2 == 0) {
                suma = suma + parells;
            }
        }
        System.out.println("La suma dels parells de " + numero + " es: " + suma);

        sc.close();
    }
}