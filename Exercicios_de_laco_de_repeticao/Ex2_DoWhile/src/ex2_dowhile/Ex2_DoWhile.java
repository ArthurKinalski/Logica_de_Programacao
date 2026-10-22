package ex2_dowhile;

import java.util.Scanner;

public class Ex2_DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, acum = 0;
        int cont = 0;
        
        do {
            System.out.print("Digite um numero real: ");
            num = teclado.nextDouble();
            if (num != 0) {
                acum += num;
                cont++;
            }
        } while (num != 0);
        
        System.out.println("Quantidade de numeros digitados: " + cont);
        
        double media = acum / cont;
        System.out.println("Media dos numeros digitados: " + media);
        
    }
}
