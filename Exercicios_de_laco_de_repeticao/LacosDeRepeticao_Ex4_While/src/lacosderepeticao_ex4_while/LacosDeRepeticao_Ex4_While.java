package lacosderepeticao_ex4_while;

import java.util.Scanner;

public class LacosDeRepeticao_Ex4_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num, fatorial = 1, cont=1;
        
        System.out.print("Informe um numero: ");
        num = teclado.nextInt();
        
        while (cont <= num) {
            fatorial *= cont;
            cont++;
        }
        
        System.out.println(num + "! = " + fatorial);
    }
    
}
