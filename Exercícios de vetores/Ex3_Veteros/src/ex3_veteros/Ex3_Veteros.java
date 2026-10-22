package ex3_veteros;

import java.util.Scanner;

public class Ex3_Veteros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanho = 9;
        int vet_numeros[] = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe o " + (i + 1) + " numero");
            vet_numeros[i] = teclado.nextInt();
        }
        
        System.out.println("");
        
        for (int i = 0; i < tamanho; i++) {
            int numAtual = vet_numeros[i];
            
            if (numAtual > 1) {
                boolean ehPrimo = true;
                
                for (int j = 2; j * j <= numAtual; j++) {
                    if (numAtual % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                if (ehPrimo == true) {
                    System.out.println(numAtual);
                }
            }
        }
    }
    
}
