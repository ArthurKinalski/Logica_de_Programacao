package ex5_caracteres;

import java.util.Scanner;

public class Ex5_caracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a data: ");
        String data = teclado.nextLine();
        
        String[] aux = data.split("/");
        
        int ano = Integer.parseInt(aux[2]);
        
        if (ano == 99) {
            ano = 0;
            System.out.println("Ano que vem: "+ano+""+ano);
        } else {
            System.out.println("Ano que vem: " + (ano + 1));
        }
    }
    
}
