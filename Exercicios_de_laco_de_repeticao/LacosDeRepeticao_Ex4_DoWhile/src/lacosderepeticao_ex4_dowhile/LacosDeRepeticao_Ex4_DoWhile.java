package lacosderepeticao_ex4_dowhile;

import java.util.Scanner;

public class LacosDeRepeticao_Ex4_DoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num, fatorial = 1, cont = 1;
        
        System.out.print("Informe um numero: ");
        num = teclado.nextInt();
        
        do {
            fatorial *= cont;
            cont++;
        } while (cont <= num);
        
        System.out.println(num + "! = " + fatorial);
    }
    
}
