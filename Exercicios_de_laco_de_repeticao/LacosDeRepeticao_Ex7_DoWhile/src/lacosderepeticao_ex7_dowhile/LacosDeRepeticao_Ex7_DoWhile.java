package lacosderepeticao_ex7_dowhile;

import java.util.Scanner;

public class LacosDeRepeticao_Ex7_DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n, i = 1;
        double e = 1.0;
        
        do {
            System.out.print("Informe o valor de N: ");
            n = teclado.nextInt();
            System.out.println("Tem que ser maior que 0");
        } while (n <= 0);
        
        do {
            int fatorial = 1;
            int j = 1;
            
            do {
                fatorial *= j;
                j++;
            } while (j <= i);
            
            e += (10.0 * i) / fatorial;
            i++;
            
        } while (i <= n);
        
        System.out.println("O valor de E eh: " + e);
        
    }
    
}
