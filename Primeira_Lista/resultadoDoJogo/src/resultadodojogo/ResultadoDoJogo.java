package resultadodojogo;

import java.util.Scanner;

public class ResultadoDoJogo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String time1, time2;
        int gols1, gols2;
        
        System.out.println("Nome do primeiro time: ");
        time1 = teclado.nextLine();
        System.out.println("Gols do primeiro time: ");
        gols1 = teclado.nextInt();
        
        System.out.println("Nome do segundo time: ");
        time2 = teclado.nextLine();
        System.out.println("Gols do segundo time: ");
        gols2 = teclado.nextInt();
        
        if (gols1 > gols2) {
            System.out.println("Vencedor: " + time1);
        } else if (gols2 > gols1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }
    }
    
}
