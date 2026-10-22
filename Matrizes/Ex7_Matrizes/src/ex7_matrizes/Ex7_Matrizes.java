package ex7_matrizes;

import java.util.Scanner;

public class Ex7_Matrizes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int quantidadeAlunos = 0;
        int quantidadeDisciplinas = 0;
        
        int max_alunos = 40, max_discip = 10;
        
        String disciplina[] = new String[max_discip];
        String alunos[] = new String[max_alunos];
        double medias[][] = new double[max_alunos][max_discip];
        
        do {
            System.out.println("\n1 - Cadastrar disciplina");
            System.out.println("2 - Cadastrar aluno");
            System.out.println("3 - Cadastrar media");
            System.out.println("4 - Listar disciplinas");
            System.out.println("5 - Listar alunos");
            System.out.println("6 - Listar alunos e media de determinada disciplina");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();
            
            if (opcao == 1) {
                if (quantidadeDisciplinas < max_discip) {
                    System.out.print("Digite o nome da disciplina: ");
                    disciplina[quantidadeDisciplinas] = teclado.nextLine();
                    quantidadeDisciplinas++;
                    System.out.println("Disciplina cadastrada!");
                } else {
                    System.out.println("Limite de disciplinas atingido!");
                }
            }
            if (opcao == 2) {
                if (quantidadeAlunos < max_alunos) {
                    System.out.print("Digite o nome do aluno: ");
                    alunos[quantidadeAlunos] = teclado.nextLine();
                    quantidadeAlunos++;
                    System.out.println("Aluno cadastrado!");
                } else {
                    System.out.println("Limite de alunos atingido!");
                }
            }
            if (opcao == 3) {
                if (quantidadeAlunos == 0 || quantidadeDisciplinas == 0) {
                    System.out.println("Cadastre alunos e disciplinas primeiro!");
                } else {
                    System.out.println("\nAlunos: ");
                    for (int i = 0; i < quantidadeAlunos; i++) {
                        System.out.println(i + " - " + alunos[i]);
                    }
                        
                    System.out.print("Escolha o numero do aluno: ");
                    int aluno = teclado.nextInt();

                    System.out.println("\nDisciplinas: ");

                    for (int i = 0; i < quantidadeDisciplinas; i++) {
                        System.out.println(i + " - " + disciplina[i]);
                    }

                    System.out.print("Escolha o numero da disciplina: ");
                    int disciplinas = teclado.nextInt();

                    System.out.print("Digite a media: ");
                    double media = teclado.nextDouble();

                    medias[aluno][disciplinas] = media;

                    System.out.println("Media cadastrada!");
                }
            }
            if (opcao == 4) {
                System.out.println("\nDisciplinas: ");
                if (quantidadeDisciplinas == 0) {
                    System.out.println("Nenhuma disciplina cadastrada.");
                } else {
                    for (int i = 0; i < quantidadeDisciplinas; i++) {
                        System.out.println(i + " - " + disciplina[i]);
                    }
                }
            }
            if (opcao == 5) {
                System.out.println("\nAlunos: ");
                if (quantidadeAlunos == 0) {
                    System.out.println("Nenhum aluno cadastrado.");
                } else {
                    for (int i = 0; i < quantidadeAlunos; i++) {
                        System.out.println(i + " - " + alunos[i]);
                    }
                }
            }
            if (opcao == 6) {
                if (quantidadeAlunos == 0 || quantidadeDisciplinas == 0) {
                    System.out.println("Cadastre alunos e disciplinas primeiro!");
                } else {
                    System.out.println("\nDisciplinas: ");
                    for (int i = 0; i < quantidadeDisciplinas; i++) {
                        System.out.println(i + " - " + disciplina[i]);
                    }
                    
                    System.out.print("Escolha a disciplina: ");
                    int disciplinas = teclado.nextInt();
                    System.out.println("\nMedias: ");
                    for (int i = 0; i < quantidadeAlunos; i++) {
                        System.out.println(alunos[i] + " - Media: " + medias[i][disciplinas]);
                    }
                }
            }
            if (opcao == 0) {
                System.out.println("Programa encerrado...");
            }
            
        } while (opcao != 0);
    }
    
}
