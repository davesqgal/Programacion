// Autor: David Esquivel Gala - CEEDCV - 1º DAM

// Importem la classe Scanner per a poder escriure en la terminal.
import java.util.Scanner;

public class ParellSenar {
    public static void main (String[] args) {

        // Objecte de la classe Scanner per a llegir dades.
        Scanner sc = new Scanner(System.in);
        
        // Indiquem per consola quin numero volem.
        System.out.print("Escriu un número: ");
        int numero = sc.nextInt();

        // Si el resto de la variable numero es 0, fa el if.
        if (numero % 2 == 0) {
            System.out.println("Aquest núemero es parell.");
        
        // Si no, fa el else.
        } else {
            System.out.println("Aquest número es senar.");
        }
        sc.close();
    }
}