package divisvisivel2e3;

import java.util.Scanner;

public class Divisvisivel2e3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um numero: ");
        num = teclado.nextInt();
        
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("o numero " + num + " eh divisivel por 2 e 3");
        }
        else if (num % 2 == 0) {
            System.out.println("o numero " + num + " eh divisivel apenas por 2");
        }
        else if (num % 3 == 0) {
            System.out.println("o numero " + num + " eh divisivel apaenas por 3");
        }
    }
    
}
