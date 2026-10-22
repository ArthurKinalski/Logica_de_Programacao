package ex5_for;

import java.util.Scanner;

public class Ex5_for {
    public static void main(String[] args) {
        Scanner miguel = new Scanner(System.in);
        
        String nome;
        int n1, n2, n3, n4, acum = 0;
        double mediaAluno, mediaTurma;
        
        for (int i = 1; i <= 35; i++) {
            System.out.println("");
            System.out.print("Digite o nome do aluno: ");
            nome = miguel.nextLine();
            
            miguel.nextLine();
            
            System.out.println("Digite as 4 notas: ");
            n1 = miguel.nextInt();
            n2 = miguel.nextInt();
            n3 = miguel.nextInt();
            n4 = miguel.nextInt();
            
            mediaAluno = (n1 + n2 + n3 + n4) / 4;
            acum = acum + n1 + n2 + n3 + n4;
            
            System.out.println("");
            System.out.println(nome);
            System.out.println("Primeira nota: " + n1);
            System.out.println("Segunda nota: " + n2);
            System.out.println("Terceira nota: " + n3);
            System.out.println("Quarta nota: " + n4);
            System.out.println("Media: " + mediaAluno);
        }
        
        mediaTurma = acum / (35 * 4);
        System.out.println("");
        System.out.println("Media da turma: " + mediaTurma);
    }
    
}
