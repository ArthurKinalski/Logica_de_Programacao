package ex3_caracteres;

import java.util.Scanner;

public class Ex3_caracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String frase = teclado.nextLine();
        
        String[] resp = frase.split(" ");
        
        int i = 0;
        while (i < resp.length) {
            i++;
        }
        
        System.out.println("\nQuantidade de palavras: " + i);
    }
    
}
