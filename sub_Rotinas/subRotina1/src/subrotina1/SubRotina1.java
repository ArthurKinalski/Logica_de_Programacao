package subrotina1;

import java.util.Scanner;

public class SubRotina1 {

    static int multiply(int a, int b) {
        int resp = a * b;
        return resp;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite dois valores para serem multiplicados: ");
        int v1 = teclado.nextInt();
        int v2 = teclado.nextInt();
        
        System.out.println("A resposta eh: " + multiply(v1, v2));
    }

}
