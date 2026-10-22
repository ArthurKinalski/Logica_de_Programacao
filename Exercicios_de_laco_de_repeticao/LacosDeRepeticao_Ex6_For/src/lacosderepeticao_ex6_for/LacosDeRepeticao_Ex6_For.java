package lacosderepeticao_ex6_for;

import java.util.Scanner;

public class LacosDeRepeticao_Ex6_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int divisores = 0;
        
        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println(numero + " eh primo");
        } else {
            System.out.println(numero + " nao eh primo");
        }
    }
    
}
