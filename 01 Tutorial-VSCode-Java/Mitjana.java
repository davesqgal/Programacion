// Autor: David Esquivel Gala - CEEDCV - 1º DAM

// Importa la classe Scanner per a poder introduir dades mediante el teclat en la terminal.
import java.util.Scanner;

public class Mitjana {
    
    public static void main (String[] args) {

        // Per a poder escriure por teclat, necessitem un objecte de la classe Scanner.
        Scanner sc = new Scanner(System.in);
        
        // Demanem les tres notes a l'usuari mitjançant l'objecte Scanner.
        System.out.print("Escritu la primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Escritu la segona nota: ");
        double nota2 = sc.nextDouble();
        
        System.out.print("Escritu la tercera nota: ");
        double nota3 = sc.nextDouble();
        
        // Una vegada que tenim les tres notes, creem una variable sumant les tres notes i dividint-les per 3.
        double mitjana = (nota1 + nota2 + nota3) / 3.0;

        // Creem un missatge en consola amb el resultat obtingut.
        System.out.println("La mitjana és: " + mitjana);

    }

}
