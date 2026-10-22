package totaldevidoporcliente;

import java.util.Scanner;

public class TotalDevidoPorCliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigoProduto, quantidade, valor;
        
        System.out.println("Informe o codigo do produto, 5, 6, 2 ou 12: ");
        codigoProduto = teclado.nextInt();
        System.out.println("Informe a quantidade comprada: ");
        quantidade = teclado.nextInt();
        
        switch (codigoProduto) {
            case 5 -> {
                valor = quantidade * 32;
                System.out.println("valor total: " + valor + " reais");
            }
            case 6 -> {
                valor = quantidade * 45;
                System.out.println("valor total: " + valor + " reais");
            }
            case 2 -> {
                valor = quantidade * 37;
                System.out.println("valor total: " + valor + " reais");
            }
            case 12 -> {
                valor = quantidade * 44;
                System.out.println("valor total: " + valor + " reais");
            }
            default -> {
                System.out.println("ERROR");
            }
        }
    }
    
}
