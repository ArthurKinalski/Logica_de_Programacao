package ex5_matrizes;

import java.util.Scanner;

public class Ex5_Matrizes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String lojas[] = new String[4];
        String produtos[] = new String[6];
        double preco[][] = new double[6][4];
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Informe o nome da " + (i+1) + "a loja: ");
            lojas[i] = teclado.nextLine();
        }
        System.out.println(" ");
        for (int i = 0; i < 6; i++) {
            System.out.print("Informe o " + (i + 1) + "o produto: ");
            produtos[i] = teclado.nextLine();
        }
        System.out.println(" ");
        for (int coluna = 0; coluna < 4; coluna++) {
            for (int linha = 0; linha < 6; linha++) {
                System.out.println("Informe o preço do produto " + produtos[linha] + " na loja " + lojas[coluna]);
                preco[linha][coluna] = teclado.nextDouble();
            }
        }
        System.out.println("\nProdutos acima de 50 reais: ");
        for (int coluna = 0; coluna < 4; coluna++) {
            for (int linha = 0; linha < 6; linha++) {
                if (preco[linha][coluna] > 50) {
                    System.out.println(produtos[linha] + " na loja " + lojas[coluna] + ", preco: " + preco[linha][coluna]);
                }
            }
        }
    }
    
}
