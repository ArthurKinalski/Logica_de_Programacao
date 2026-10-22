package lacosderepeticao_ex2_for;

import java.util.Scanner;

public class LacosDeRepeticao_Ex2_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a serie: ");
        int serie = teclado.nextInt();
        
        int termo = 2;
        
        for (int i = 1; i <= serie; i++) {
            System.out.println(termo);
            termo = termo * 2;
        }
    }
    
}
