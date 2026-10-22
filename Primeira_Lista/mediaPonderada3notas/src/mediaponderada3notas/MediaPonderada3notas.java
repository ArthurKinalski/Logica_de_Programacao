package mediaponderada3notas;

import java.util.Scanner;

public class MediaPonderada3notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double N1, N2, N3, media;
        String aluno;
        
        System.out.println("Digite o nome do aluno: ");
        aluno = teclado.nextLine();
        System.out.println("Digite a primeira nota: ");
        N1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        N2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota: ");
        N3 = teclado.nextDouble();
        
        media = ((N1 * 4) + (N2 * 3) + (N3 * 3)) / 10;
        
        if (media < 5) {
            System.out.println(aluno + ": REPROVADO ");
            System.out.println("Notas: " + N1 + " " + N2 + " " + N3);
            System.out.println("Media: " + media);
        } else {
            System.out.println(aluno + ": APROVADO ");
            System.out.println("Notas: " + N1 + " " + N2 + " " + N3);
            System.out.println("Media: " + media);
        }
    }
    
}
