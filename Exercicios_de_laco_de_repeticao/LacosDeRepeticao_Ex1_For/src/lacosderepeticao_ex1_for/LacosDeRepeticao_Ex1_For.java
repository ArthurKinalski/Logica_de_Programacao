package lacosderepeticao_ex1_for;

public class LacosDeRepeticao_Ex1_For {
    public static void main(String[] args) {
        
        for (int multiplicando = 0, multiplicador = 0; multiplicador <= 10 && multiplicando <= 10; ) {
            System.out.println(multiplicando + " x " + multiplicador + " = " + multiplicador * multiplicando);
            multiplicador++;
            if (multiplicador > 10 ) {
                multiplicador = 0;
                multiplicando++;
            }
        }
        
    }
    
}
