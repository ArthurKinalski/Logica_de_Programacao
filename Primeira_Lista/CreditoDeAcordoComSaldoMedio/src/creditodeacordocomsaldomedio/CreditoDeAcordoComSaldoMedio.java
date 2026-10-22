package creditodeacordocomsaldomedio;

import java.util.Scanner;

public class CreditoDeAcordoComSaldoMedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldoMedio, valorCredito;
        
        System.out.println("Digite seu saldo medio: ");
        saldoMedio = teclado.nextDouble();
        
        if (saldoMedio < 201) {
            System.out.println("Nenhum credito a mais");
        } else if (saldoMedio < 401) {
            valorCredito = saldoMedio * 0.2;
            System.out.println("Saldo medio: " + saldoMedio + " Valor de credito: " + valorCredito);
        } else if (saldoMedio < 601) {
            valorCredito = saldoMedio * 0.3;
            System.out.println("Saldo medio: " + saldoMedio + " Valor de credito: " + valorCredito);
        } else {
            valorCredito = saldoMedio * 0.4;
            System.out.println("Saldo medio: " + saldoMedio + " Valor de credito: " + valorCredito);
        }
    }
    
}
