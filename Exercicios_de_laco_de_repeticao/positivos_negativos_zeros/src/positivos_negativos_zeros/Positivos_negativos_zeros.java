package positivos_negativos_zeros;

import java.util.Scanner;

public class Positivos_negativos_zeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, positivos = 0, negativos = 0, zeros = 0;
        int i = 1;
        
        while (i <= 10) {
            System.out.println("Informe o numero: ");
            num = teclado.nextInt();
            
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                zeros++;
            }
            i++;
        }
        System.out.println(positivos + " positivos");
        System.out.println(negativos + " negativos");
        System.out.println(zeros + " zeros");
    }
    
}
