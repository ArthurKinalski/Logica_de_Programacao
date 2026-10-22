package lacosderepeticao_ex2_dowhile;

import java.util.Scanner;

public class LacosDeRepeticao_Ex2_DoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a serie: ");
        int serie = teclado.nextInt();

        int termo = 2, i = 1;

        do {
            System.out.println(termo);
            termo = termo * 2;
            i++;
        } while (i <= serie);
    }

}
