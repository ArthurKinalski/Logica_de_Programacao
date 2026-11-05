package subrotina5;

import java.util.Scanner;

public class SubRotina5 {

    static double media(char ap, double a, double b, double c) {
        return switch (ap) {
            case 'A' -> (a + b + c) / 3;
            case 'a' -> (a + b + c) / 3;
            case 'P' -> ((a * 5) + (b * 3) + (c * 2)) / 10;
            case 'p' -> ((a * 5) + (b * 3) + (c * 2)) / 10;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe as tres notas: ");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();

        System.out.println("""
                           \nDigite - A - para calcular media aritimetica;
                           Digite - P - para calcular media ponderada:""");
        char A_P = teclado.next().charAt(0);
        
        System.out.println("\nMedia: " + media(A_P, nota1, nota2, nota3));
    }

}
