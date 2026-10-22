package lacosderepeticao_ex1_dowhile;

public class LacosDeRepeticao_Ex1_DoWhile {
    public static void main(String[] args) {
        
        int multiplicando = 0, multiplicador = 0;
        
        do {
            System.out.println(multiplicando + " x " + multiplicador + " = " + multiplicador * multiplicando);
            multiplicador++;
            if (multiplicador > 10 ) {
                multiplicador = 0;
                multiplicando++;
            }
        } while (multiplicador <= 10 && multiplicando <= 10);
    }    
}
