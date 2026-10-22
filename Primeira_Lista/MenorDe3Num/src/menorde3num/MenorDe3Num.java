package menorde3num;

import java.util.Scanner;

public class MenorDe3Num {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Digite o primeiro numero:");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero:");
        n2 = teclado.nextInt();
        System.out.println("Digite o terceiro numero:");
        n3 = teclado.nextInt();

        if (n1 < n2) {
            if (n1 < n3) {
                System.out.println(n1 + " eh o menor");
            } else if (n3 < n1) {
                System.out.println(n3 + " eh o menor");
            }
        } else if (n2 < n1) {
            if (n2 < n3) {
                System.out.println(n2 + " eh o menor");
            } else if (n3 < n2) {
                System.out.println(n3 + " eh o menor");
            }
        }
    }

}
