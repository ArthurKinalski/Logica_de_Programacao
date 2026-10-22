package lacosderepeticao_ex4_for;

import java.util.Scanner;

public class LacosDeRepeticao_Ex4_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num, fatorial = 1;
        
        System.out.print("Informe um numero: ");
        num = teclado.nextInt();
        
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        
        System.out.println(num + "! = " + fatorial);
    }
    
}
