package maisexercicio;

import java.util.Scanner;

public class Maisexercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, cont = 0, acum = 0;
        System.out.println("Digite dois numeros");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        
        while (cont >= n1 && cont <= n2) {
            if (cont % 2 == 1) {
                acum += cont;
            }
            cont = cont + 1;
        }
        System.out.println(acum);
    }
    
}
