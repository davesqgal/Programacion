// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class SumaDigits {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduixca el numero: ");
        int numero = sc.nextInt();
        int numinicial = numero;
        int suma = 0;


        // Fa un bucle el qual agafa les unitats de numero y la suma a la variable suma. Després divideix entre 10, i torna
        // a agafar les unitats (que abans eres les decenes) i les suma. El bucle acaba cuando no pot dividir mes el numero.
        while (numero >= 1) {
            suma = suma + (numero % 10);
            numero = numero / 10; 
        }
        
        System.out.print("La suma del digits de " + numinicial + " es: " + suma);

    }
}