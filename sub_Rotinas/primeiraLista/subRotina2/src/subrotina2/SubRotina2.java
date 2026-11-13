package subrotina2;

import java.util.Scanner;

public class SubRotina2 {

    static int somaEntre(int inicio, int fim) {
        int acum = 0;
        for (int i = inicio+1; i < fim; i++) {
            acum += i;
        }
        return acum;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite dois valores: ");
        int ini = teclado.nextInt();
        int fim = teclado.nextInt();
        
        System.out.println("A resposta eh: " + somaEntre(ini, fim));
    }

}
