package subrotina3;

import java.util.Scanner;

public class SubRotina3 {

    static int[] segForHoras(int segundos) {
        int horas = segundos / 3600;
        int segRest = segundos % 3600;
        
        int minutos = segRest / 60;
        int seg = segRest % 60;
        
        return new int[] {horas, minutos, seg};
        
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe os segundos: ");
        int seg = teclado.nextInt();
        
        int[] resultado = segForHoras(seg);
        
        System.out.println("resposta: " + resultado[0] + ":" + resultado[1] + ":" + resultado[2]);
    }

}
