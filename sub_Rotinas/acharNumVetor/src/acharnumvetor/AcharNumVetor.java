package acharnumvetor;

public class AcharNumVetor {

    static boolean achar(int[] vet, int n) {
        for (int i = 0; i < vet.length; i++) {
            if (n == vet[i]) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] vet = {2, 4, 6, 8, 10, 11, 13, 15, 17, 19};
        System.out.println(achar(vet, 2));
        System.out.println(achar(vet, 3));
    }
    
}
