package ex2_vetores;

import java.util.Scanner;

public class Ex2_Vetores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanho = 10;
        int vet_numeros[] = new int[tamanho];
        int maiores50 = 0;
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe o " + (i + 1) + " numero");
            vet_numeros[i] = teclado.nextInt();
        }
        
        System.out.println("");
        
        for (int i = 0; i < tamanho; i++) {
            if (vet_numeros[i] > 50) {
                System.out.println(vet_numeros[i]);
                maiores50++;
            }
        }
        
        if (maiores50 == 0) {
            System.out.println("Nao ha numeros maiores que 50");
        }
    }
    
}
