// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class Primer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quin número positiu vols saber si és primer? ");
        int numero = sc.nextInt();

        sc.close();
        /* Comprovació si el número es primer
        Primer comprobem si no es menor o igual a 1
        Després que no siga 2, y dque no siga divisible per dos
        y per últim, fem un bucle per a comprobar els numeros senars.
        Començem per 3 y anem sumant de 2 en 2, fins que aplega al numero que volem comprovar.
        Quan el número es divisible por qualsevol d'eixe número, no es senant
        Si aplega al numero que volem comprovar, es que es primer. */
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
