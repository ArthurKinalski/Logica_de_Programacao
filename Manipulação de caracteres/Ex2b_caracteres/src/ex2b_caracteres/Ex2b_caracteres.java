package ex2b_caracteres;

/* 2e – Faça um programa onde o usuário deve digitar uma senha. Valide que essa senha contenha ao
menos 8 caracteres, um número, um caractere maiúsculo e um símbolo. Dica: veja tabela ASCII. */

import java.util.Scanner;

public class Ex2b_caracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean numero = false, maiusculo = false, simbolo = false;
        
        System.out.println("Digite a senha: ");
        String senha = teclado.nextLine();
        
        char[] charSenha = senha.toCharArray();
        
        // numeros
        for (int i = 0; i < charSenha.length; i++) {
            if (!numero) {
                if ((int) charSenha[i] >= 48 && (int) charSenha[i] <= 57) {
                    numero = true;
                }
            }
        }
        // maiusculo
        for (int i = 0; i < charSenha.length; i++) {
            if (!maiusculo) {
                if ((int) charSenha[i] >= 65 && (int) charSenha[i] <= 90) {
                    maiusculo = true;
                }
            }
        }
        // simbolo
        for (int i = 0; i < charSenha.length; i++) {
            if (!simbolo) {
                if ((int) charSenha[i] >= 33 && (int) charSenha[i] <= 47 ||
                        (int) charSenha[i] >= 58 && (int) charSenha[i] <= 64 ||
                        (int) charSenha[i] >= 91 && (int) charSenha[i] <= 96 ||
                        (int) charSenha[i] >= 123 && (int) charSenha[i] <= 126) {
                    simbolo = true;
                }
            }
        }
        
        if (charSenha.length >= 8 && numero == true && maiusculo == true && simbolo == true) {
            System.out.println("Senha boa!");
        } else {
            System.out.println("Senha ruim!");
        }
    }
    
}
