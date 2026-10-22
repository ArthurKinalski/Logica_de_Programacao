package lacosderepeticao_ex8_while;

import java.util.Scanner;

public class LacosDeRepeticao_Ex8_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos jogadores possui o time? ");
        int n = teclado.nextInt();
        teclado.nextLine();

        int menores = 0;
        int somaIdadeMaiores = 0;
        int qtdMaiores = 0;
        int acima80 = 0;
        double somaAlturas = 0;

        String nome1 = "", nome2 = "", nome3 = "";
        double alt1 = 0, alt2 = 0, alt3 = 0;

        int i = 1;

        while (i <= n) {

            System.out.println("\nJogador " + i);

            System.out.print("Nome: ");
            String nome = teclado.nextLine();

            System.out.print("Idade: ");
            int idade = teclado.nextInt();

            System.out.print("Peso: ");
            double peso = teclado.nextDouble();

            System.out.print("Altura: ");
            double altura = teclado.nextDouble();
            teclado.nextLine();

            if (idade < 18) {
                menores++;
            } else {
                somaIdadeMaiores += idade;
                qtdMaiores++;
            }

            if (peso > 80) {
                acima80++;
            }

            somaAlturas += altura;

            if (altura > alt1) {
                alt3 = alt2;
                nome3 = nome2;

                alt2 = alt1;
                nome2 = nome1;

                alt1 = altura;
                nome1 = nome;

            } else if (altura > alt2) {
                alt3 = alt2;
                nome3 = nome2;

                alt2 = altura;
                nome2 = nome;

            } else if (altura > alt3) {
                alt3 = altura;
                nome3 = nome;
            }

            i++;
        }

        double mediaIdade = 0;
        if (qtdMaiores > 0) {
            mediaIdade = (double) somaIdadeMaiores / qtdMaiores;
        }

        double porcentagem80 = (double) acima80 * 100 / n;
        double mediaAltura = somaAlturas / n;

        System.out.println("\n===== RELATORIO =====");
        System.out.println("Menores de idade: " + menores);
        System.out.println("Media de idade dos maiores: " + mediaIdade);
        System.out.println("Porcentagem acima de 80kg: " + porcentagem80 + "%");
        System.out.println("Altura media do time: " + mediaAltura);

        System.out.println("\n3 jogadores mais altos:");
        System.out.println("1 " + nome1 + " - " + alt1 + " m");
        System.out.println("2 " + nome2 + " - " + alt2 + " m");
        System.out.println("3 " + nome3 + " - " + alt3 + " m");
    }
}