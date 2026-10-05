// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class Primer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quin número positiu vols saber si és primer? ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("El número " + numero + " no es primer.");
        } else if (numero == 2) {
            System.out.println("El número " + numero + " es primer.");
        } else if (numero % 2 == 0) {
            System.out.println("El número " + numero + " no es primer.");
        } else {
            for (int i = 3; i * i <= numero; i += 2) {
                if (numero % i == 0) {
                    System.out.println("El número " + numero + " no es primer");
                    return;
                }
            }
            System.out.println("El número " + numero + " es primer.");
        }
    }
}
