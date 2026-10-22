package classificaridadesporcategoria;

import java.util.Scanner;

public class ClassificarIdadesPorCategoria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Digite o nome ");
        nome = teclado.nextLine();
        System.out.println("Digite a sua idade ");
        idade = teclado.nextInt();

        if (idade < 1) {
            System.out.println(nome + ": não mente seu corno!!!");
        }
        else if (idade < 5) {
            System.out.println(nome + ": sem categoria");
        }
        else if (idade < 8) {
            System.out.println(nome + ": categoria infantil sub 8");
        }
        else if (idade < 11) {
            System.out.println(nome + ": categoria infantil sub 11");
        }
        else if (idade < 14) {
            System.out.println(nome + ": categoria juvenil sub 14");
        }
        else if (idade < 18) {
            System.out.println(nome + ": categoria juvenil sub 18");
        }
        else if (idade < 60) {
            System.out.println(nome + ": categoria adulto");
        }
        else if (idade < 130) {
            System.out.println(nome + ": véio");
        } else {
            System.out.println(nome + ": cara, tu tá vivo?");
        }
    }
}
