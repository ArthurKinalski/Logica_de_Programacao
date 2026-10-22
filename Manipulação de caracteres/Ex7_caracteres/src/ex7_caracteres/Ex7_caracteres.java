package ex7_caracteres;

import java.util.Scanner;

public class Ex7_caracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nomeCompleto, nomeAbrev = "";
        
        System.out.print("Informe um nome completo: ");
        nomeCompleto = teclado.nextLine();
        
        String[] aux = nomeCompleto.split(" ");
        nomeAbrev += aux[0] + " ";
        
        for (int i = 1; i < aux.length - 1; i++) {
            nomeAbrev += aux[i].charAt(0) + ". ";
        }
        nomeAbrev += aux[aux.length - 1];
        System.out.println("Nome abreviado: " + nomeAbrev);
    }
    
}
