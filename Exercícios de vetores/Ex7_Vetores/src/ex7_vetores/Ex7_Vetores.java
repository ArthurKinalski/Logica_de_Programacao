package ex7_vetores;

import java.util.Scanner;

public class Ex7_Vetores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int tamanho = 5;
        String[] funcionarios = new String[tamanho];
        double[] salario = new double[tamanho];
        int[] tempo = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o nome do " + (i+1) + "o funcionrio: ");
            funcionarios[i] = teclado.nextLine();
            
            System.out.print("Informe o salario atual de " + funcionarios[i] + ": ");
            salario[i] = teclado.nextDouble();
            
            System.out.print("Informe por quantos anos de serviço " + funcionarios[i] + " passou: ");
            tempo[i] = teclado.nextInt();
            teclado.nextLine();
            System.out.println("");
        }
        
        System.out.println("\nFuncionarios que NAO terao aumento: ");
        for (int i = 0; i < tamanho; i++) {
            if (salario[i] >= 1940 && tempo[i] <= 5) {
                System.out.println(funcionarios[i]);
            }
        }
        
        System.out.println("\nFuncionarios que terao aumento: ");
        for (int i = 0; i < tamanho; i++) {
            if (salario[i] < 1940 && tempo[i] > 5) {
                salario[i] = salario[i] + (salario[i] * 0.35);
                System.out.println(funcionarios[i] + ": Salario reajustado para R$" + salario[i]);
            }
            else if (salario[i] < 1940) {
                salario[i] = salario[i] + (salario[i] * 0.15);
                System.out.println(funcionarios[i] + ": Salario reajustado para R$" + salario[i]);
            }
            else if (tempo[i] > 5) {
                salario[i] = salario[i] + (salario[i] * 0.25);
                System.out.println(funcionarios[i] + ": Salario reajustado para R$" + salario[i]);
            }
        }
    }
    
}
