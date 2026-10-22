package ex2_matrizes;

import java.util.Scanner;

public class Ex2_Matrizes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numeros[][] = new int [3][3];
        
        System.out.println("Digite os numeros da matriz: ");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                numeros[linha][coluna] = teclado.nextInt();
            }
        }
        
        int menor = numeros[0][0];
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (numeros[linha][coluna] < menor) {
                    menor = numeros[linha][coluna];
                }
            }
        }
        System.out.println("\nO menor eh: " + menor);
    }
    
}
