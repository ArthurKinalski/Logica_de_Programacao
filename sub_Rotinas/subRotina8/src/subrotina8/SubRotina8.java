package subrotina8;

import java.util.Scanner;

public class SubRotina8 {

    static int maior(int[] n) {
        int maior = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > maior) {
                maior = n[i];
            }
        }
        return maior;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] valores = new int[5];
        
        System.out.println("Informe 5 valores: ");
        valores[0] = teclado.nextInt();
        valores[1] = teclado.nextInt();
        valores[2] = teclado.nextInt();
        valores[3] = teclado.nextInt();
        valores[4] = teclado.nextInt();
        
        System.out.println("\nO maior eh: " + maior(valores));
    }

}
