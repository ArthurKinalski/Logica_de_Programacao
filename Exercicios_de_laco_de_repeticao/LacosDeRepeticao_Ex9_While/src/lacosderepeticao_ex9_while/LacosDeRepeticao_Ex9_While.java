package lacosderepeticao_ex9_while;

import java.util.Scanner;

public class LacosDeRepeticao_Ex9_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int opcao = 0;
        int quantidade;
        double total = 0;
        char produto;
        
        while (opcao != 3) {
            System.out.println("\n===== CANTINA =====");
            System.out.println("1 - Registrar venda");
            System.out.println("2 - Apresentar total e calcular troco");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = teclado.nextInt();
            
            if (opcao == 1) {
                System.out.println("\nProdutos:");
                System.out.println("a - Agua - R$ 3,50");
                System.out.println("b - Salgado - R$ 5,00");
                System.out.println("c - Salada de Frutas - R$ 7,50");
                
                System.out.print("Produto: ");
                produto = teclado.next().charAt(0);

                System.out.print("Quantidade: ");
                quantidade = teclado.nextInt();

                if (produto == 'a') {
                    total += quantidade * 3.5;
                } else if (produto == 'b') {
                    total += quantidade * 5.0;
                } else if (produto == 'c') {
                    total += quantidade * 7.5;
                } else {
                    System.out.println("Produto inválido.");
                }
            } else if (opcao == 2) {
                System.out.println("Total da compra: R$ " + total);

                System.out.print("Valor pago: R$ ");
                double pago = teclado.nextDouble();
                
                double troco = pago - total;

                if (pago >= total) {
                    System.out.println("Troco: R$ " + troco);
                    total = 0;
                } else {
                    System.out.println("Valor insuficiente.");
                }
            } else if (opcao == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opcao invalida.");
            }
        }
    }
    
}
