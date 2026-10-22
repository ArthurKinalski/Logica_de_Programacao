package CelciusouFahrenheit;

import java.util.Scanner;

public class CelciusOuFahrenheit {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int escolha;
        double tempC, tempF;

        System.out.println("Digite 1 para converter celcius para fahrenheit, ou digite 2 para o contrário:");
        escolha = teclado.nextInt();

        switch (escolha) {
            case 1 -> {
                System.out.println("Digite o temperatura em Celcius:");
                tempC = teclado.nextDouble();
                tempF = (9 * tempC + 160) / 5.0;
                System.out.println("Fahrenheit: " + tempF);
            }
            case 2 -> {
                System.out.println("Digite o temperatura em Fahrenheit:");
                tempF = teclado.nextDouble();
                tempC = (tempF - 32) * (5 / 9.0);
                System.out.println("Celcius: " + tempC);
            }
            default -> {
                System.out.println("ERRO!");
            }
        }
    }
}
