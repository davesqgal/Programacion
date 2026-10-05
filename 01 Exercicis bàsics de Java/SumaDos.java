// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;


public class SumaDos {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduixca el primer nombre: ");
        int primer = sc.nextInt();
        System.out.print("Introduixca el segon nombre5: ");
        int segon = sc.nextInt();

        int suma = primer + segon;
            
        System.out.println("La suma es: " + suma);

        }
    
}
