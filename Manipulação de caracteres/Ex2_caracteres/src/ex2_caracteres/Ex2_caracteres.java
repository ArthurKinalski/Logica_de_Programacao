package ex2_caracteres;

import java.util.Scanner;

public class Ex2_caracteres {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String str = teclado.nextLine();
        
        int vogais = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.toUpperCase().charAt(i) == 'A'
                || str.toUpperCase().charAt(i) == 'E'
                || str.toUpperCase().charAt(i) == 'I'
                || str.toUpperCase().charAt(i) == 'O'
                || str.toUpperCase().charAt(i) == 'U') {
                vogais++;
            }
        }
        
        System.out.println("\nQuantidade de vogais: " + vogais);
    }
    
}
