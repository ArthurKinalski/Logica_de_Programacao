package invertervetor;

public class InverterVetor {

    static int[] inverter(int[] vetor) {
        int[] vet_invert = new int[vetor.length];
        int j = vetor.length - 1;
        for (int i = 0; i < vetor.length; i++) {
            vet_invert[i] = vetor[j];
            j--;
        }
        
        return vet_invert;
    }
    
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        
        int[] vet_invertido = inverter(vetor);
        for (int i = 0; i < vet_invertido.length; i++) {
            System.out.print(vet_invertido[i] + ", ");
        }
    }
    
}
