package calcvolumedecaixa;

import java.util.Scanner;

public class CalcVolumeDeCaixa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, largura, comprimento, volume;
        
        System.out.println("Digite a altura da caixa: ");
        altura = teclado.nextDouble();
        System.out.println("Digite a largura da caixa: ");
        largura = teclado.nextDouble();
        System.out.println("Digite o comprimento da caixa: ");
        comprimento = teclado.nextDouble();
        
        volume = altura * largura * comprimento;
        
        System.out.println("O volume eh: " + volume);
    }
    
}
