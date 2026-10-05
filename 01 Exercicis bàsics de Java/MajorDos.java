// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class MajorDos {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduixca el primer número: ");
        int primer = sc.nextInt();

        System.out.print( "Introduixa el segon número: ");
        int segon = sc.nextInt();

        if (primer > segon) {
            System.out.println(primer + " es major que " + segon);
        } else if (primer < segon) {
            System.out.println(segon + " es major que " + primer);
        } else {
            System.out.println(primer + " i " + segon + " son iguals.");
        }

    }

}
