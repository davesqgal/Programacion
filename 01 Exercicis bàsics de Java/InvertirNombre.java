// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class InvertirNombre {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueixca el número que vullga invertir: ");
        int numero = sc.nextInt();
        int primernum = numero;
        int newnumber = 0;

        // Multiplica per 10 el numero de newnumber primer (la primera vegada es 0, aixi que dona el mateix), després agafa
        // les unitats de numero y las suma a newnumber i divideix entre 10 numero per a poder agafar el següent numero.
        // Repeteix el bucle fins que la divisió de numero siga menys de 0.
        while (numero > 0) {
            newnumber = newnumber * 10;
            newnumber = newnumber + (numero % 10);
            numero = numero / 10;
        }
        System.out.println("La inversió del dígits " + primernum + " es: " + newnumber);
        sc.close();
    }
}
