package ex6_caracteres;

import java.util.Scanner;

public class Ex6_caracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um nome completo: ");
        String nome = teclado.nextLine();
        
        String[] aux = nome.split(" ");
        int i = aux.length - 1;
        String[] primeiros = aux;
        
        System.out.print(aux[i] + ",");
        for (int j = 0; j < aux.length - 1; j++) {
            System.out.print(" " + primeiros[j]);
        }
        System.out.println(" ");
    }
    
}
