// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Introdueixca un número: ");
    int numero = sc.nextInt();

    long factorial = 1;

        // Es crea la variable i que s'utilitza per a iterar desde 1 fins al número introduit. En cada iteració, i suma 1.
        // i es multiplica per el valor actual de factorial en cada iteració, Quan i arriba al valor de numero, el bucle 
        // finalitza y es mostra el resultat de factorial per la terminal.
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
    System.out.println("El factorial de " + numero + " es: " + factorial);

    }    
}
