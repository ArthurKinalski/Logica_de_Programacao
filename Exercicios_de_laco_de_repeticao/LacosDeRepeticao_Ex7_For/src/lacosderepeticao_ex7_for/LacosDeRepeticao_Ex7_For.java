package lacosderepeticao_ex7_for;

import java.util.Scanner;

public class LacosDeRepeticao_Ex7_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n = 0;
        double e = 1.0;
        
        do {
            System.out.print("Informe o valor de N: ");
            n = teclado.nextInt();
            System.out.println("Tem que ser maior que 0");
        } while (n <= 0);
        
        for (int i = 1; i <= n; i++) {
            int fatorial = 1;
            
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            
            e += (10.0 * i) / fatorial;
        }
        
        System.out.println("O valor de E eh: " + e);
    }
    
}
