package subrotina7;

import java.util.Scanner;

public class SubRotina7 {
    
    static boolean ehPrimo(int n) {
        int divisores = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores++;
            }
        }
        return divisores == 2;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = teclado.nextInt();
        
        if (ehPrimo(num)) {
            System.out.println("Eh Primo!!!");
        } else {
            System.out.println("Nao eh primo");
        }
        
    }

}
