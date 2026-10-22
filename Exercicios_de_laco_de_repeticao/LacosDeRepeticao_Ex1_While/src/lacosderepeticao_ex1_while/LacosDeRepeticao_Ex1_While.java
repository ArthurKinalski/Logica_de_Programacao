package lacosderepeticao_ex1_while;

public class LacosDeRepeticao_Ex1_While {
    public static void main(String[] args) {
        
        int multiplicando = 0, multiplicador = 0;
        
        
        while (multiplicador <= 10 && multiplicando <= 10) {
            System.out.println(multiplicando + " x " + multiplicador + " = " + multiplicador * multiplicando);
            multiplicador++;
            if (multiplicador > 10 ) {
                multiplicador = 0;
                multiplicando++;
            }
        }
    }
}
