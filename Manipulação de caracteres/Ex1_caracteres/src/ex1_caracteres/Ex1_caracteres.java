package ex1_caracteres;

import java.util.Scanner;

public class Ex1_caracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String str = teclado.nextLine();
        
        int caracteres = str.length();
        
        System.out.println("\nA quantidade de caracteres eh: " + caracteres);
    }
    
}
