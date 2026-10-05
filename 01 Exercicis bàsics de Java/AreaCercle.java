// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class AreaCercle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduixca el radi del cercle: ");
        float radi = sc.nextFloat();

        // Açi fiquem una variable double perque Math.PI te més decimals que el que
        // capen a un float.
        double area = (Math.PI * (radi * radi));

        // Per a imprimir tot a la mateixa línea li llevem al print el "ln".
        System.out.print("El àrea del cercle es: ");

        // El printf el que fa açi es añadir el format que s'indica avans de la variable
        // El % es el indicador de inici del format
        // El . indica que el format s'aplica a decimals
        // El 2 definix quants digits mostrar tras la coma
        // La f asenyala el tipus de dat, float en aquest cas
        System.out.printf("%.2f", area);
        sc.close();
    }

}
