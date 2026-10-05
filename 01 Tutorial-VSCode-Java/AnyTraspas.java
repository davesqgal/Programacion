// Autor: David Esquivel Gala - CEEDCV - 1º DAM

import java.util.Scanner;

public class AnyTraspas {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Es solicita l'any a l'usuari
    System.out.print("Introdueix l'any: ");
    int any = sc.nextInt();
    
    // Comproba la variable any. La divideix entre 4 i comproba que no siga divisible entre 100 o que siga divisible entre 400. 
    // Si es compleis la primera condició i una de les dues altres, es considera any traspàs. Després mostra por terminal el resultat.
    if ((any % 4 == 0) && (any % 100 != 0 || any % 400 == 0)) {
        System.out.println("L'any " + any + " és any traspàs.");
    } else {
        System.out.println("L'any " + any + " no és any traspàs.");
    }
    sc.close();
    }
}
