// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class Suma1aN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Es solicita un número al usuari.
        System.out.print("Introdueix un número: ");
        int numero = sc.nextInt();

        // Es declara una variable per a la suma. Després, es declara una nueva variable amb valor 1 i es es comproba si es menor o igual
        // que la variable número. Si és així, s'incrementa la variable i en 1 i es suma a la variable suma.
        // Quan la variable i és igual a la variable número, es mostra el resultat de la suma.
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma = suma + i;
            }
        System.out.println("La suma de 1 a " + numero + " es: " + suma);

        sc.close();      
    }
}
