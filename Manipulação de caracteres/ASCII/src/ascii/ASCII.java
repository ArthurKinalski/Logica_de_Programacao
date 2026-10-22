package ascii;

public class ASCII {

    public static void main(String[] args) {
        for (int i = 0; i < 256; i++) {
            System.out.print(i + ":");
            char letra = (char) i;
            System.out.println(letra + ";");
        }
    }
    
}
