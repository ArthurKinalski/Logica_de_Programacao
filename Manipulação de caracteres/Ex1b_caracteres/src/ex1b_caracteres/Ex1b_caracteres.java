package ex1b_caracteres;

import java.util.Scanner;

public class Ex1b_caracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String senha = "Belos%53105";
        String daviRhenns = " ";
        
        do {
            System.out.println("Digite a senha: ");
            daviRhenns = teclado.nextLine();
            if (daviRhenns.equals(senha)) {
                System.out.println("ENTROU!!");
            } else {
                System.out.println("Senha incorreta");
            }
        } while (!daviRhenns.equals(senha));
    }
    
}
