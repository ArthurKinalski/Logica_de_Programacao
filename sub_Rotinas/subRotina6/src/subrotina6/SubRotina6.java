package subrotina6;

import java.util.Scanner;

public class SubRotina6 {

    static int duracaoMin(int hi, int mi, int hf, int mf) {
        int inicio = hi * 60 + mi;
        int fim = hf * 60 + mf;
        int duracao;
        
        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (24 * 60 - inicio) + fim;
        }
        
        return duracao;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int horaIni, minIni, horaFim, minFim;
        
        System.out.println("Digite a hora e o minuto que o jogo iniciou: ");
        horaIni = teclado.nextInt();
        minIni = teclado.nextInt();
        
        System.out.println("\nDigite a hora e o minuto que jogo acabou: ");
        horaFim = teclado.nextInt();
        minFim = teclado.nextInt();
        
        System.out.println("\nA duracao total em minutos foi: " + duracaoMin(horaIni, minIni, horaFim, minFim));
        
    }

}
