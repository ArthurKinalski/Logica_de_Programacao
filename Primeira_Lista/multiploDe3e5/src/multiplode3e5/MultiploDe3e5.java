package multiplode3e5;

import java.util.Scanner;

public class MultiploDe3e5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Digite um número");
        num = teclado.nextInt();

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("o número " + num + " é múltiplo de 5 e 3");
        } else if (num % 5 == 0) {
            System.out.println("o número " + num + " é múltiplo de 5");
        } else if (num % 3 == 0) {
            System.out.println("o número " + num + " é múltiplo de 3");
        }
    }

}
