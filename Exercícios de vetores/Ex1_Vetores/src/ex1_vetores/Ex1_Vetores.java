package ex1_vetores;

import java.util.Scanner;

public class Ex1_Vetores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int vet_numeros[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o " + (i + 1) + " numero");
            vet_numeros[i] = teclado.nextInt();
        }
        
        System.out.println("");
        
        for (int i = 0; i < 5; i++) {
            if (vet_numeros[i] % 2 == 0) {
                System.out.println(vet_numeros[i]);
            }
        }
    }
    
}
