package lacosderepeticao_ex5_for;

import java.util.Scanner;

public class LacosDeRepeticao_Ex5_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a = 0, b = 1, c;
        int termo;
        
        System.out.print("Informe ate onde vai a sequencia: ");
        termo = teclado.nextInt();
        
        for (int i = 1; i <= termo; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
    
}
