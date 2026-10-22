package celciusparafahrenheit;

import java.util.Scanner;

public class CelciusParaFahrenheit {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double c, f;
        System.out.println("Digite uma temperatura em graus Celcius");
        c = teclado.nextDouble();
        f = (9 * c + 160) / 5.0;
        System.out.println("A temperatura em Fahrenheit é: " + f);
    }

}
