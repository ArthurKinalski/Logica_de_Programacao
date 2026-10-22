package ex4_vetores;

import java.util.Scanner;

public class Ex4_Vetores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tamanho = 5;
        String animais[] = new String[tamanho];
        String frutas[] = new String[tamanho];
        String mesclado[] = new String[tamanho * 2];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe o " + (i + 1) + "o animal");
            animais[i] = teclado.nextLine();
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe a " + (i + 1) + "a fruta");
            frutas[i] = teclado.nextLine();
        }

        int i = 0;
        for (int j = 0; j < tamanho; j++) {
            mesclado[i++] = animais[j];
            mesclado[i++] = frutas[j];
        }

        for (int j = 0; j < (tamanho * 2); j++) {
            System.out.println(mesclado[j]);
        }
    }

}
