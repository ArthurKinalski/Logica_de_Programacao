package subrotina4;

import java.util.Scanner;

public class SubRotina4 {

    static boolean ehTriangulo(int a, int b, int c) {
        return a + b > c && b + c > a && c + a > b;
    }
    
    static String tipoTriangulo(int a, int b, int c) {
        if (a == b && b == c) {
            return "Equilatero";
        } else if (a != b && b != c && c != a) {
            return "Escaleno";
        } else {
            return "Isosceles";
        }
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a medida dos lados do Triangulo: ");
        int ladoA = teclado.nextInt();
        int ladoB = teclado.nextInt();
        int ladoC = teclado.nextInt();
        
        if (ehTriangulo(ladoA, ladoB, ladoC)) {
            System.out.println("Eh triangulo!!!");
            System.out.println(tipoTriangulo(ladoA, ladoB, ladoC));
        } else {
            System.out.println("Nao eh triangulo!!!");
        }
    }

}
