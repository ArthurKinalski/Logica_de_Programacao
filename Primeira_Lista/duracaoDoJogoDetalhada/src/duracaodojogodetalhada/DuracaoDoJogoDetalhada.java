package duracaodojogodetalhada;

import java.util.Scanner;

public class DuracaoDoJogoDetalhada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int horaInicio, minInicio;
        int horaFim, minFim;
        int inicioTotal, fimTotal;
        int duracaoTotal;
        int horas, minutos;
        
        System.out.println("Hora de início: ");
        horaInicio = teclado.nextInt();

        System.out.println("Minuto de início: ");
        minInicio = teclado.nextInt();

        System.out.println("Hora de término: ");
        horaFim = teclado.nextInt();

        System.out.println("Minuto de término: ");
        minFim = teclado.nextInt();

        inicioTotal = horaInicio * 60 + minInicio;
        fimTotal = horaFim * 60 + minFim;

        if (fimTotal > inicioTotal) {
            duracaoTotal = fimTotal - inicioTotal;
        } else {
            duracaoTotal = (24 * 60 - inicioTotal) + fimTotal;
        }

        horas = duracaoTotal / 60;
        minutos = duracaoTotal % 60;

        System.out.println("Duração do jogo: "+ horas + " hora(s) e " + minutos + " minuto(s)");
    }
    
}
