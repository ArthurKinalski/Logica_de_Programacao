package duracaodojogo;

import java.util.Scanner;

public class DuracaoDoJogo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int inicio, fim, duracao;

        System.out.println("Hora de início: ");
        inicio = teclado.nextInt();

        System.out.println("Hora de término: ");
        fim = teclado.nextInt();

        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (24 - inicio) + fim;
        }

        System.out.println("Duração do jogo: " + duracao + (duracao == 1 ? " hora" : " horas"));
    }
    
}
