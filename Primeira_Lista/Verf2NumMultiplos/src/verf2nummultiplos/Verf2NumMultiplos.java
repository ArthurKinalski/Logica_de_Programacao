package verf2nummultiplos;

import java.util.Scanner;

public class Verf2NumMultiplos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primeiro numero");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = teclado.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("sao multiplos");
        } else {
            System.out.println("nao sao multiplos");
        }
    }

}
