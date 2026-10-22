package ex1_matrizes;

import java.util.Scanner;

public class Ex1_Matrizes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numeros[][] = new int [5][5];
        
        System.out.println("Digite os numeros da matriz: ");
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                numeros[linha][coluna] = teclado.nextInt();
            }
        }
        
        for (int linha = 0; linha < 5; linha++) {
            System.out.println(" ");
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print(numeros[linha][coluna] + " ");
            }
        }
    }
    
}
