package omaiordovetor;

public class OMaiorDoVetor {

    static int Maior(int[] n) {
        int maior = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > maior) {
                maior = n[i];
            }
        }
        return maior;
    }
    
    public static void main(String[] args) {
        int[] vet = {2, 4, 8, 16, 32, 64, 128};
        System.out.println(Maior(vet));
    }
    
}
