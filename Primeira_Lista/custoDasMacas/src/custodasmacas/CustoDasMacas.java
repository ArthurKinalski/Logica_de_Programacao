package custodasmacas;

import java.util.Scanner;

public class CustoDasMacas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int macas;
        double macasCalc, custoTotal;
        
        System.out.println("Insira o numero de maçãs: ");
        macas = teclado.nextInt();
        
        if (macas < 12) {
            macasCalc = macas;
            custoTotal = macasCalc * 1.3;
            System.out.println("Custo total: R$" + custoTotal);
        } else {
            custoTotal = macas * 1;
            System.out.println("Custo total: R$" + custoTotal);
        }
    }
    
}
