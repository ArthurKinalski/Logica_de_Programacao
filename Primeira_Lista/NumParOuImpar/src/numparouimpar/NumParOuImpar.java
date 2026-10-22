package numparouimpar;

import java.util.Scanner;

public class NumParOuImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        System.out.println("Digite um número");
        num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
