package mediaaproveitamento;

import java.util.Scanner;

public class MediaAproveitamento {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroAluno;
        double nota1, nota2, nota3, me, ma;
        String conceito, situacao;

        System.out.println("Número do aluno: ");
        numeroAluno = teclado.nextInt();

        System.out.println("Nota 1: ");
        nota1 = teclado.nextDouble();

        System.out.println("Nota 2: ");
        nota2 = teclado.nextDouble();

        System.out.println("Nota 3: ");
        nota3 = teclado.nextDouble();

        System.out.println("Média dos exercícios: ");
        me = teclado.nextDouble();

        ma = (nota1 + nota2 * 2 + nota3 * 3 + me) / 7;

        if (ma >= 9.0) {
            conceito = "A";
            situacao = "APROVADO";
        } else if (ma >= 7.5) {
            conceito = "B";
            situacao = "APROVADO";
        } else if (ma >= 6.0) {
            conceito = "C";
            situacao = "APROVADO";
        } else if (ma >= 4.0) {
            conceito = "D";
            situacao = "REPROVADO";
        } else {
            conceito = "E";
            situacao = "REPROVADO";
        }

        System.out.println("Aluno: " + numeroAluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média de Exercícios: " + me);
        System.out.println("Média de Aproveitamento: " + ma);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);
    }
}