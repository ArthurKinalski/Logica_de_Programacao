package ex5_while;

import java.util.Scanner;

public class Ex5_while {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        int n1, n2, n3, n4, i = 1, acum = 0;
        double mediaAluno, mediaTurma; 
        
        while (i <= 35) {
            System.out.println("");
            System.out.print("Digite o nome do aluno: ");
            nome = teclado.nextLine();
            
            teclado.nextLine();
            
            System.out.println("Digite as 4 notas: ");
            n1 = teclado.nextInt();
            n2 = teclado.nextInt();
            n3 = teclado.nextInt();
            n4 = teclado.nextInt();
            
            mediaAluno = (n1 + n2 + n3 + n4) / 4;
            acum = acum + n1 + n2 + n3 + n4;
            
            System.out.println("");
            System.out.println(nome);
            System.out.println("Primeira nota: " + n1);
            System.out.println("Segunda nota: " + n2);
            System.out.println("Terceira nota: " + n3);
            System.out.println("Quarta nota: " + n4);
            System.out.println("Media: " + mediaAluno);
            
            i++;
        }
        
        mediaTurma = acum / (35 * 4);
        System.out.println("");
        System.out.println("Media da turma: " + mediaTurma);
    }
    
}
