package lacosderepeticao_ex7_while;

import java.util.Scanner;

public class LacosDeRepeticao_Ex7_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n = 0, i = 1;
        double e = 1.0;
        
        while (n <= 0) {
            System.out.print("Informe o valor de N: ");
            n = teclado.nextInt();
            System.out.println("Tem que ser maior que 0");
        }
        
        while (i <= n) {
            int fatorial = 1;
            int j = 1;
            
            while (j <= i) {
                fatorial *= j;
                j++;
            }
            
            e += (10.0 * i) / fatorial;
            i++;
        }
        
        System.out.println("O valor de E eh: " + e);
        
    }
    
}
