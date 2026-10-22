package trocavalordevariavel;

import java.util.Scanner;

public class TrocaValorDeVariavel {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, troca;
        
        System.out.println("Digite o valor de A:");
        A = teclado.nextInt();
        System.out.println("Digite o valor de B:");
        B = teclado.nextInt();
        
        troca = A;
        A = B;
        B = troca;
        
        System.out.println("O valor de A eh: " + A + ". E o valor de B eh: " + B);
    }
    
}
