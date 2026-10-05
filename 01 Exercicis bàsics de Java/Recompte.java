// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class Recompte {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriga els números per a contar. Amb 0 acaba el reconte");
        int numero = sc.nextInt();
        int positiu = 0;
        int negatiu = 0;
        
        // Mentre numero no siga 0, el while continua contant, si es >0 suma 1 a positiu i si es <0 suma 1 a negatiu. Quan
        // s'escriu 0, el while acaba.
        while (numero != 0) {
            if (numero > 0) {
                positiu++;
            } else {
                negatiu++;
            }
            numero = sc.nextInt();
        }
        System.out.println("Has escrit " + positiu + " números positius.");
        System.out.println("Has escrit " + negatiu + " números negatius.");
        int total = positiu + negatiu;
        System.out.println("Total de números introduits: " + total);
        
        sc.close();
    }
}