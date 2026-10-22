package idades;

import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int homem1, homem2;
        int mulher1, mulher2;

        int homemVelho, homemNovo;
        int mulherVelha, mulherNova;

        int soma, produto;

        System.out.println("Idade do primeiro homem: ");
        homem1 = teclado.nextInt();

        System.out.println("Idade do segundo homem: ");
        homem2 = teclado.nextInt();

        System.out.println("Idade da primeira mulher: ");
        mulher1 = teclado.nextInt();

        System.out.println("Idade da segunda mulher: ");
        mulher2 = teclado.nextInt();

        // Homens
        if (homem1 > homem2) {
            homemVelho = homem1;
            homemNovo = homem2;
        } else {
            homemVelho = homem2;
            homemNovo = homem1;
        }

        // Mulheres
        if (mulher1 > mulher2) {
            mulherVelha = mulher1;
            mulherNova = mulher2;
        } else {
            mulherVelha = mulher2;
            mulherNova = mulher1;
        }

        soma = homemVelho + mulherNova;
        produto = homemNovo * mulherVelha;

        System.out.println("Soma = " + soma);
        System.out.println("Produto = " + produto);
    }
    
}
