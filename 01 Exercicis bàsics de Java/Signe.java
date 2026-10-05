// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class Signe {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduixca un número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es positiu.");
        } else if (numero < 0) {
            System.out.println( "El número es negatiu.");
        } else {
            System.out.println( "El número es zero.");
        }
        sc.close();
    }

}