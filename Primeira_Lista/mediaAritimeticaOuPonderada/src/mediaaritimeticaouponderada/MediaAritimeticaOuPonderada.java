package mediaaritimeticaouponderada;

import java.util.Scanner;

public class MediaAritimeticaOuPonderada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double N1, N2, N3, media;
        int escolha;
        
        System.out.println("Digite 1 se quiser calcular a media aritimetica, ou 2 se quiser calcular a media ponderada: ");
        escolha = teclado.nextInt();
        switch (escolha){
            case 1 -> {
                System.out.println("Digite a primeira nota: ");
                N1 = teclado.nextDouble();
                System.out.println("Digite a segunda nota: ");
                N2 = teclado.nextDouble();
                System.out.println("Digite a terceira nota: ");
                N3 = teclado.nextDouble();
                
                media = (N1 + N2 + N3) / 3;
                
                if (media < 5) {
                    System.out.println("REPROVADO ");
                    System.out.println("Notas: " + N1 + " " + N2 + " " + N3);
                    System.out.println("Media aritimetica: " + media);
                } else {
                    System.out.println("APROVADO ");
                    System.out.println("Notas: " + N1 + " " + N2 + " " + N3);
                    System.out.println("Media aritimetica: " + media);
                }
            
            } case 2 -> {
                System.out.println("Digite a primeira nota: ");
                N1 = teclado.nextDouble();
                System.out.println("Digite a segunda nota: ");
                N2 = teclado.nextDouble();
                System.out.println("Digite a terceira nota: ");
                N3 = teclado.nextDouble();
                
                media = ((N1 * 4) + (N2 * 3) + (N3 * 3)) / 10;
                
                if (media < 5) {
                    System.out.println("REPROVADO ");
                    System.out.println("Notas: " + N1 + " " + N2 + " " + N3);
                    System.out.println("Media ponderada: " + media);
                } else {
                    System.out.println("APROVADO ");
                    System.out.println("Notas: " + N1 + " " + N2 + " " + N3);
                    System.out.println("Media ponderada: " + media);
                }
            } default -> {
                System.out.println("ERROR");
            }
        }
    }
    
}
