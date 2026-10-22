package ex5_vetores;

import java.util.Scanner;

public class Ex5_Vetores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int vet_Grande[] = new int[100];
        int vet_Busca[] = new int[5];
        
        for (int i = 0; i < vet_Grande.length; i++) {
            vet_Grande[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < vet_Busca.length; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            vet_Busca[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < vet_Busca.length; i++) {
            int numeroProcurado = vet_Busca[i];
            
            System.out.println("Numero " + numeroProcurado + " encontrado nas posicoes: ");
            
            for (int j = 0; j < vet_Grande.length; j++) {
                if (vet_Grande[j] == numeroProcurado) {
                    System.out.println(j + " ");
                }
            }
        }
        
    }
    
}
