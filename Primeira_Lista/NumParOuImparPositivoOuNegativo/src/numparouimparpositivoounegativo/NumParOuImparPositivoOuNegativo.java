package numparouimparpositivoounegativo;

import java.util.Scanner;

public class NumParOuImparPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um numero: ");
        num = teclado.nextInt();
        
        if (num < 0) {
            if (num % 2 == 0) {
                System.out.println(num + ": eh par e negativo");
            } else {
                System.out.println(num + ": eh impar e negativo");
            }
        } else {
            if (num % 2 == 0) {
                System.out.println(num + ": eh par e positivo");
            } else {
                System.out.println(num + ": eh impar e positivo");
            }
        }
    }
    
}
