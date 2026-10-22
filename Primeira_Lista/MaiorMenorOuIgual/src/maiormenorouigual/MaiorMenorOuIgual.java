package maiormenorouigual;

import java.util.Scanner;

public class MaiorMenorOuIgual {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double num1, num2;

        System.out.println("Informe o primeiro número: ");
        num1 = teclado.nextDouble();
        System.out.println("Informe o segundo número: ");
        num2 = teclado.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num1 == num2) {
            System.out.println("os dois números são iguais");
        } else if (num1 < num2) {
            System.out.println(num2 + " é maior que " + num1);
        }
    }
}
