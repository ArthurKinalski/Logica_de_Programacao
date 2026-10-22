package lacosderepeticao_ex2_while;

import java.util.Scanner;

public class LacosDeRepeticao_Ex2_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a serie: ");
        int serie = teclado.nextInt();
        
        int termo = 2, i = 1;
        
        while (i <= serie) {
            System.out.println(termo);
            termo = termo * 2;
            i++;
        }
    }

}
