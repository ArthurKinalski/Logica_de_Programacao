package mediadovetor;

public class MediaDoVetor {

    static double media(double[] n) {
        double soma = 0;
        for (int i = 0; i < n.length; i++) {
            soma += n[i];
        }
        double media = soma / n.length;
        return media;
    }
    
    public static void main(String[] args) {
        double[] vet = {3.14, 25, 62.2, 47.7, 84};
        System.out.println(media(vet));
    }
    
}
