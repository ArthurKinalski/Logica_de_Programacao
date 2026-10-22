package lacosderepeticao_ex6_dowhile;

import java.util.Scanner;

public class LacosDeRepeticao_Ex6_DoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int divisores = 0, i = 1;
        
        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();
        
        do {
            if (numero % i == 0) {
                divisores++;
            }
            i++;
        } while (i <= numero);
        
        if (divisores == 2) {
            System.out.println(numero + " eh primo");
        } else {
            System.out.println(numero + " nao eh primo");
        }
    }
    
}
