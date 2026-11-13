package subrotina9;

import java.util.Scanner;

public class SubRotina9 {

    static String abrevNome(String nomeCompleto) {
        String nomeAbrev = "";
        String[] aux = nomeCompleto.split(" ");
        nomeAbrev += aux[0] + " ";
        
        for (int i = 1; i < aux.length - 1; i++) {
            nomeAbrev += aux[i].charAt(0) + ". ";
        }
        nomeAbrev += aux[aux.length - 1];
        return nomeAbrev;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("\n" + abrevNome(nome));
    }

}
