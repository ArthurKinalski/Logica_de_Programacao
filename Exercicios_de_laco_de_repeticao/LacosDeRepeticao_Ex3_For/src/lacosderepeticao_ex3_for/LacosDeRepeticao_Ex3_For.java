package lacosderepeticao_ex3_for;

import java.util.Scanner;

public class LacosDeRepeticao_Ex3_For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int eleitor = 1, votantes, AAA = 0, BBB = 0, CCC = 0, branco = 0, voto;
        
        System.out.print("Informe a quantidade de votantes: ");
        votantes = teclado.nextInt();
        
        for (int i = 0; i < votantes; i++) {
            System.out.println("(0 = nulo, 1 = AAA, 2 = BBB, 3 = CCC)");
            System.out.print("Eleitor: " + eleitor +". Informe o seu voto: ");
            voto = teclado.nextInt();
            eleitor++;
            
            if (voto == 0) {
                branco++;
            }else if (voto == 1) {
                AAA++;
            }else if (voto == 2) {
                BBB++;
            }else if (voto == 3) {
                CCC++;
            }
        }
        
        if (AAA > BBB && AAA > CCC) {
            System.out.println("Vencedor: AAA");
            System.out.println("Votos AAA: " + AAA);
            System.out.println("Votos BBB: " + BBB);
            System.out.println("Votos CCC: " + CCC);
            System.out.println("Votos nulos: " + branco);
        } else if (BBB > AAA && BBB > CCC) {
            System.out.println("Vencedor: BBB");
            System.out.println("Votos AAA: " + AAA);
            System.out.println("Votos BBB: " + BBB);
            System.out.println("Votos CCC: " + CCC);
            System.out.println("Votos nulos: " + branco);
        } else if (CCC > AAA && CCC > BBB) {
            System.out.println("Vencedor: CCC");
            System.out.println("Votos AAA: " + AAA);
            System.out.println("Votos BBB: " + BBB);
            System.out.println("Votos CCC: " + CCC);
            System.out.println("Votos nulos: " + branco);
        } else if (AAA == BBB) {
            System.out.println("Empate: AAA x BBB");
            System.out.println("Votos AAA: " + AAA);
            System.out.println("Votos BBB: " + BBB);
            System.out.println("Votos CCC: " + CCC);
            System.out.println("Votos nulos: " + branco);
        } else if (BBB == CCC) {
            System.out.println("Empate: BBB x CCC");
            System.out.println("Votos AAA: " + AAA);
            System.out.println("Votos BBB: " + BBB);
            System.out.println("Votos CCC: " + CCC);
            System.out.println("Votos nulos: " + branco);
        } else if (CCC == AAA) {
            System.out.println("Empate: AAA x CCC");
            System.out.println("Votos AAA: " + AAA);
            System.out.println("Votos BBB: " + BBB);
            System.out.println("Votos CCC: " + CCC);
            System.out.println("Votos nulos: " + branco);
        }
    }
    
}
