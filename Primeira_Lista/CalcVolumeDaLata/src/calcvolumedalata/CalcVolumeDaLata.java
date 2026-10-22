package calcvolumedalata;

import java.util.Scanner;

public class CalcVolumeDaLata {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double altura, volume, raio;
        System.out.println("Digite a altura da lata:");
        altura = teclado.nextDouble();
        System.out.println("Digite o raio da lata:");
        raio = teclado.nextDouble();
        
        volume = 3.14159 * raio * raio * altura;
        
        System.out.println("O volume da lata de é: " + volume);
        
    }
    
}
