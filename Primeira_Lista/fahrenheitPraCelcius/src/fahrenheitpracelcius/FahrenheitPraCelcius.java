package fahrenheitpracelcius;

import java.util.Scanner;

public class FahrenheitPraCelcius {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double f, c;
        System.out.println("Digute uma temperatura em Fahrenheit");
        f = teclado.nextDouble();
        c =  (f - 32) * (5 / 9.0);
        System.out.println("A temperatura em Celcuis é: " + c);
        // fim
    }
    
}
