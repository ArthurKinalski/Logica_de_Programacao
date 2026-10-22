package lacosderepeticao_ex6_while;

import java.util.Scanner;

public class LacosDeRepeticao_Ex6_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int divisores = 0, i = 1;
        
        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();
        
        while (i <= numero) {
            if (numero % i == 0) {
                divisores++;
            }
            i++;
        }
        
        if (divisores == 2) {
            System.out.println(numero + " eh primo");
        } else {
            System.out.println(numero + " nao eh primo");
        }
    }
    
}
