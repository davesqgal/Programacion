// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class Nota {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quina es la teua nota? ");
        double nota = sc.nextDouble();

        if (nota < 5) {
            System.out.println("La teua nota correspon a un insuficient.");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("La teua nota correspon a un suficient.");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("La teua nota correspon a un bé.");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("La teua nota correspon a un notable.");
        } else {
            System.out.println("Enhorabona!, tens una nota excel·lent!");
        }

    }

}