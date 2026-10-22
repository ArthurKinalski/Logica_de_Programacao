package ordenarvalores;

import java.util.Scanner;

public class OrdenarValores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int i;
        double a, b, c;
        double menor, meio, maior;
        
        System.out.print("Digite 1 para crescente, 2 pra decrescente ou 3 para o maior ficar no meio: ");
        i = teclado.nextInt();
        
        System.out.println("Digite o primeiro numero: ");
        a = teclado.nextDouble();
        System.out.println("Digite o segundo numero: ");
        b = teclado.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        c = teclado.nextDouble();
        
        menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        meio = a + b + c - menor - maior;
        
        switch (i) {

            case 1 -> {
                System.out.println("Ordem crescente:");
                System.out.println(menor + " " + meio + " " + maior);
                break;
            }
            case 2 -> {
                System.out.println("Ordem decrescente:");
                System.out.println(maior + " " + meio + " " + menor);
                break;
            }
            case 3 -> {
                System.out.println("Maior valor no meio:");
                System.out.println(menor + " " + maior + " " + meio);
                break;
            }
            default -> {
                System.out.println("Valor de i invalido!");
            }
        }
    }
}