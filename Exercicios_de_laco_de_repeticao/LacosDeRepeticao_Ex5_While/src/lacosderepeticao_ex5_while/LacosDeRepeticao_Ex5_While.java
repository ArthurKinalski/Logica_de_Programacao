package lacosderepeticao_ex5_while;

import java.util.Scanner;

public class LacosDeRepeticao_Ex5_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a = 0, b = 1, c;
        int termo, i = 1;
        
        System.out.print("Informe ate onde vai a sequencia: ");
        termo = teclado.nextInt();
        
        while (i <= termo) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
    
}
