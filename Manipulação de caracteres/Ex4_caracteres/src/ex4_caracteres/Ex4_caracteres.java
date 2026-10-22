package ex4_caracteres;

import java.util.Scanner;

public class Ex4_caracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um nome completo: ");
        String nome = teclado.nextLine();
        
        String[] primeiroNome = nome.split(" ");
        
        System.out.println(primeiroNome[0]);
    }
    
}
