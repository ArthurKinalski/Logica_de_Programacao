package ex4_matrizes;

import java.util.Scanner;

public class Ex4_Matrizes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String alunos[] = new String[6];
        double notas[][] = new double[3][6];
        
        System.out.println("Informe o nome de 6 alunos: ");
        for (int i = 0; i < 6; i++) {
            alunos[i] = teclado.nextLine();
        }
        
        for (int coluna = 0; coluna < 6; coluna++) {
            System.out.println("Informe as notas de: " + alunos[coluna]);
            for (int linha = 0; linha < 3; linha++) {
                notas[linha][coluna] = teclado.nextDouble();
            }
        }
        
        for (int coluna = 0; coluna < 6; coluna++) {
            double soma = 0;
            for (int linha = 0; linha < 3; linha++) {
                soma += notas[linha][coluna];
            }

            double media = soma / 3;
            System.out.println("\nAluno: " + alunos[coluna]);
            System.out.println("Média: " + media);
            if (media >= 6) {
                System.out.println("Situacao: Aprovado");
            } else {
                System.out.println("Situacao: Reprovado");
            }
        }
    }
    
}