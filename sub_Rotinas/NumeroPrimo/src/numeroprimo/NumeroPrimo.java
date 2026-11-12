package numeroprimo;

public class NumeroPrimo {

    public static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }
        return testaDivisor(n, 2);
    }
    
    private static boolean testaDivisor(int n, int divisor) {
        
        if (divisor * divisor > n) {
            return true;
        }
        
        if (n % divisor == 0) {
            return false;
        }
       
        return testaDivisor(n, divisor + 1);
    }
    
    public static void main(String[] args) {
        System.out.println(ehPrimo(13));
        System.out.println(ehPrimo(15));
    }
    
}
