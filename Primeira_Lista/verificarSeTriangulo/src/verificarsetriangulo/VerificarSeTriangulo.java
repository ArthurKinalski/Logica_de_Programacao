package verificarsetriangulo;

import java.util.Scanner;

public class VerificarSeTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ladoA, ladoB, ladoC;
        double perimetro, area;
        
        System.out.println("Informe o primeiro lado: ");
        ladoA = teclado.nextInt();
        System.out.println("Informe o segundo lado: ");
        ladoB = teclado.nextInt();
        System.out.println("Informe o terceiro lado: ");
        ladoC = teclado.nextInt();
        
        if (ladoA + ladoB > ladoC &&
            ladoB + ladoC > ladoA &&
            ladoC + ladoA > ladoB) {
            perimetro = (ladoA + ladoB + ladoC) / 2.0;
            area = Math.sqrt(perimetro * (perimetro - ladoA) * (perimetro - ladoB) * (perimetro - ladoC));
            
            System.out.println("Eh triangulo!");
            System.out.println("Area do triângulo: " + area);
        } else {
            System.out.println("Não eh triangulo");
            System.out.println("Lado A: " + ladoA);
            System.out.println("Lado B: " + ladoB);
            System.out.println("Lado C: " + ladoC);
        }
    }
    
}
