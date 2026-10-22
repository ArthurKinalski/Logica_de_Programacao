package lacosderepeticao_ex10_for;

import java.util.Scanner;

public class LacosDeRepeticao_Ex10_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cor = "";

        int azul = 0, vermelho = 0, verde = 0;
        int n;

        System.out.print("Informe a quantidade de cores: ");
        n = teclado.nextInt();
        teclado.nextLine();
        
        for (int i = 1; i <= n; i++) {
             System.out.print("Digite uma cor: ");
            cor = teclado.nextLine();

            if (cor.equalsIgnoreCase("azul")) {
                azul++;
            } else if (cor.equalsIgnoreCase("vermelho")) {
                vermelho++;
            } else if (cor.equalsIgnoreCase("verde")) {
                verde++;
            }
        }
        
        System.out.println("\nAzul foi digitada " + azul + " vezes.");

        if (verde > vermelho) {
            System.out.println("A cor verde foi mais digitada que vermelho.");
        } else if (vermelho > verde) {
            System.out.println("A cor vermelha foi mais digitada que verde.");
        } else {
            System.out.println("Verde e vermelha foram digitadas a mesma quantidade de vezes.");
        }
    }
    
}
