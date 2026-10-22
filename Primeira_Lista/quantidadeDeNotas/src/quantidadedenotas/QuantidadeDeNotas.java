package quantidadedenotas;

import java.util.Scanner;

public class QuantidadeDeNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int reais, N200, N100, N50, N10;
        
        System.out.println("Digite o valor em reais: ");
        reais = teclado.nextInt();
        
        if (reais > 0 && reais % 10 == 0) {
            N200 = reais / 200;
            N100 = (reais % 200) / 100;
            N50 = (reais % 200 % 100) / 50;
            N10 = (reais % 200 % 100 % 50) / 10;
            System.out.println(N200 + (N200 == 1 ? " nota" : " notas") + " de 200");
            System.out.println(N100 + (N100 == 1 ? " nota" : " notas") + " de 100");
            System.out.println(N50 + (N50 == 1 ? " nota" : " notas") + " de 50");
            System.out.println(N10 + (N10 == 1 ? " nota" : " notas") + " de 10");
        } else {
            System.out.println("Inválido");
        }
    }
    
}
