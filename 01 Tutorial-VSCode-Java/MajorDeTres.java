// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class MajorDeTres {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // Demanem a l'usuari que en escriga el tres números i els guardem en variables.
        System.out.print("Escriu el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Escriu el segon número: ");
        int numero2 = sc.nextInt();
        System.out.print("Escriu el tercer número: ");
        int numero3 = sc.nextInt();

        // Comprovem quin es el major del tres. Primer comprobem si el numero1 o numero2 son el majors, y comparem si n'hi ha empats.
        // Si no hi ha empats, comprobem si el primer es major que el segun i el tercer. Si no, comprovem si
        // el segon es major que el primer i el tercer. Si no es, solo quedaría el tercer com a major.
        // També podriem, en lugar de mostrar el missatge en pantalla directament, guardar el major en una nueva variable i al final,
        // mostrar eixa variable per pantalla.
        if (numero1 >= numero2 && numero1 >= numero3 && (numero1 == numero2 || numero1 == numero3)) {
            System.out.println("El número " + numero1 + " es el major (Enpatat)");
        } else if (numero2 >= numero1 && numero2 >= numero3 && (numero2 == numero1 || numero2 == numero3)) {
            System.out.println("El número " + numero2 + " es el major (Enpatat)");
        } else if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("El primer número es el major: " + numero1);
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("El segon número es el major del tres: " + numero2);
        } else {
            System.out.println("El major del tres es el tercer número: " + numero3);
        }
        sc.close();
    }
}

