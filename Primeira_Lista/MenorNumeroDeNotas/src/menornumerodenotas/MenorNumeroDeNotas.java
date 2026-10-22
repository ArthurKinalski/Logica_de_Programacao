package menornumerodenotas;

import java.util.Scanner;

public class MenorNumeroDeNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int valor, n100, n50, n10, n5, n1;
        
        System.out.println("Digite o valor em reais: ");
        valor = teclado.nextInt();
        
        int restante = valor;
        
         n100 = restante / 100;
        restante = restante % 100;

        n50 = restante / 50;
        restante = restante % 50;

        n10 = restante / 10;
        restante = restante % 10;

        n5 = restante / 5;
        restante = restante % 5;

        n1 = restante;

        System.out.println("Valor lido: R$ " + valor);
        System.out.println("Notas de 100: " + n100);
        System.out.println("Notas de 50: " + n50);
        System.out.println("Notas de 10: " + n10);
        System.out.println("Notas de 5: " + n5);
        System.out.println("Notas de 1: " + n1);
    }
    
}
