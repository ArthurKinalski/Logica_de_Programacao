package ex1_dowhile;

import java.util.Scanner;

public class Ex1_DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int senha = 1945;
        
        do {
            System.out.println("Digite a senha: ");
            senha = teclado.nextInt();
            if (senha != 1945) {
                System.out.println("Senha incorreta!");
            }
        } while (senha != 1945);
        
        System.out.println("Voce entrou!");
    }
    
}
