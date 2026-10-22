package ex6_vetores;

import java.util.Scanner;

public class Ex6_Vetores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int quantidade = 5;
        String[] veiculo = new String[quantidade];
        double[] consumo = new double[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe o " + (i + 1) + "o veiculo: ");
            veiculo[i] = teclado.nextLine();
            
            System.out.println("Informe o consumo medio de Km/L do " + veiculo[i] + ": ");
            consumo[i] = teclado.nextDouble();
            teclado.nextLine();
        }
        
        System.out.println("\nInforme o valor em Reais do combustível: ");
        double combustivel = teclado.nextDouble();
        
        int maisEconomico = 0;
        int menosEconomico = 0;
        
        for (int i = 1; i < quantidade; i++) {
            if (consumo[i] > consumo[maisEconomico]) {
                maisEconomico = i;
            }
            if (consumo[i] < consumo[menosEconomico]) {
                menosEconomico = i;
            }
        }
        
        System.out.println("\nVeiculo mais economico: " + veiculo[maisEconomico] + "(" + consumo[maisEconomico] + "Km/L)");
        System.out.println("Veiculo menos economico: " + veiculo[menosEconomico] + "(" + consumo[menosEconomico] + "Km/L)");
        
        System.out.println("\n--- CUSTO PARA PERCORRER 780 KM ---");
        double distancia = 780.0;
        
        for (int i = 0; i < quantidade; i++) {
            double litrosNecessarios = distancia / consumo[i];
            double custoTotal = litrosNecessarios * combustivel;
            
            System.out.println(veiculo[i] + ": R$" + custoTotal);
        }
    }
    
}
