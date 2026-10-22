package aumentodesalario;

import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, newSalario, diferenca;
        int cargo;
        
        System.out.println("Informe seu salario atual: ");
        salario = teclado.nextInt();
        
        System.out.println("Informe seu cargo: ");
        cargo = teclado.nextInt();
        
        switch (cargo) {
            case 101 -> {
                newSalario = salario + (salario * 0.1);
                diferenca = newSalario - salario;
                System.out.println("Salario antigo: " + salario);
                System.out.println("Salario novo: " + newSalario);
                System.out.println("Diferença: " + diferenca);
            }
            case 102 -> {
                newSalario = salario + (salario * 0.2);
                diferenca = newSalario - salario;
                System.out.println("Salario antigo: " + salario);
                System.out.println("Salario novo: " + newSalario);
                System.out.println("Diferença: " + diferenca);
            }
            case 103 -> {
                newSalario = salario + (salario * 0.3);
                diferenca = newSalario - salario;
                System.out.println("Salario antigo: " + salario);
                System.out.println("Salario novo: " + newSalario);
                System.out.println("Diferença: " + diferenca);
            }
            default -> {
                newSalario = salario + (salario * 0.4);
                diferenca = newSalario - salario;
                System.out.println("Salario antigo: " + salario);
                System.out.println("Salario novo: " + newSalario);
                System.out.println("Diferença: " + diferenca);
            }
        }
    }
    
}
