package divisivel5e7;

import java.util.Scanner;

public class Divisivel5e7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um numero: ");
        num = teclado.nextInt();
        
        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("o numero " + num + " eh divisivel por 5 e 7");
        }
        else if (num % 5 == 0) {
            System.out.println("o numero " + num + " eh divisivel apenas por 5");
        }
        else if (num % 7 == 0) {
            System.out.println("o numero " + num + " eh divisivel apaenas por 7");
        }
    }
    
}
