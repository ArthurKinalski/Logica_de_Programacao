package mediade3notas;

import java.util.Scanner;

public class MediaDe3notas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double N1, N2, N3, media;

        System.out.println("Insira a primeira nota");
        N1 = teclado.nextDouble();
        System.out.println("Insira a segunda nota");
        N2 = teclado.nextDouble();
        System.out.println("Insira a terceira nota");
        N3 = teclado.nextDouble();

        media = (N1 + N2 + N3) / 3;

        if (media >= 6) {
            System.out.println("média: " + media + " Aprovado");
        } else {
            System.out.println("média: " + media + "Reprovado");
        }
    }
}
