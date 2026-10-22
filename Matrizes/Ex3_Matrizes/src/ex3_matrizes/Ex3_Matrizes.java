package ex3_matrizes;

import java.util.Scanner;

public class Ex3_Matrizes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numeros[][] = new int[2][2];
        int multipl[][] = new int[2][2];
        
        System.out.println("Informe os numeros: ");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                numeros[linha][coluna] = teclado.nextInt();
            }
        }
        System.out.println(" ");
        int maior = numeros[0][0];
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                if (numeros[linha][coluna] > maior) {
                    maior = numeros[linha][coluna];
                }
            }
        }
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                multipl[linha][coluna] = numeros[linha][coluna] * maior;
            }
        }
        for (int linha = 0; linha < 2; linha++) {
            System.out.println(" ");
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print(multipl[linha][coluna] + " ");
            }
        }
    }
    
}
