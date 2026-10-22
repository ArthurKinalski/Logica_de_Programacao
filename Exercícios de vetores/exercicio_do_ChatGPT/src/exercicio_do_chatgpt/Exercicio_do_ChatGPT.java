package exercicio_do_chatgpt;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_do_ChatGPT {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner teclado = new Scanner(System.in);
        int continuar = 1;
        
        while (continuar == 1) {
            int tamanho = 10;
            int vet_numeros[] = new int[tamanho];
            int soma = 0;
            int maior;
            int menor;
            int quantidade_pares = 0;

            for (int i = 0; i < tamanho; i++) {
                System.out.println("Informe o " + (i + 1) + "o número");
                vet_numeros[i] = teclado.nextInt();
                soma = soma + vet_numeros[i];
            }
            double media = soma / (tamanho * 1.0);

            // maior
            maior = vet_numeros[0];
            for (int i = 0; i < tamanho; i++) {
                if (vet_numeros[i] > maior) {
                    maior = vet_numeros[i];
                }
            }

            // menor
            menor = vet_numeros[0];
            for (int i = 0; i < tamanho; i++) {
                if (vet_numeros[i] < menor) {
                    menor = vet_numeros[i];
                }
            }

            // pares
            for (int i = 0; i < tamanho; i++) {
                if (vet_numeros[i] % 2 == 0) {
                    quantidade_pares++;
                }
            }

            // resultados

            System.out.print("\nElementos: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(vet_numeros[i] + " ");
            }
            System.out.println("\nSoma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Quantidade de pares: " + quantidade_pares);
            System.out.print("Elementos nas posições ímpares: ");
            for (int i = 0; i < tamanho; i++) {
                if (i % 2 != 0) {
                    System.out.print(vet_numeros[i] + " ");
                }
            }
            
            System.out.print("\n\nDeseja reiniciar: 1 - sim, 2 - nao: ");
            continuar = teclado.nextInt();
        }
    }
}
