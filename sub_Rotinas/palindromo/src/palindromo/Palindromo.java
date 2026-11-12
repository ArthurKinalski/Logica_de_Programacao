package palindromo;

public class Palindromo {

    static boolean ehPalindromo(String word) {
        if (word.length() <= 1) {
            return true;
        }
        
        char primeira = word.charAt(0);
        char ultima = word.charAt(word.length() - 1);
        
        if (primeira != ultima) {
            return false;
        }
        
        String meio = word.substring(1, word.length() - 1);
        return ehPalindromo(meio);
    }
    
    public static void main(String[] args) {
        System.out.println(ehPalindromo("arara"));
        System.out.println(ehPalindromo("casa"));
    }
    
}
