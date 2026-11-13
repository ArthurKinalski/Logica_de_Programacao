package num0a100;

public class Num0a100 {

    static void print0a100() {
        print0a100(-1);
    }
    
    static void print0a100(int n) {
        if (n == 100) return;
        System.out.println(n + 1);
        print0a100(n + 1);
    }
    
    public static void main(String[] args) {
        print0a100();
    }
    
}
