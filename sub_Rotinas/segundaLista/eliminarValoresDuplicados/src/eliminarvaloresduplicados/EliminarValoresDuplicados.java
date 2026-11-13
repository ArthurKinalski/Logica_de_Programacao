package eliminarvaloresduplicados;

public class EliminarValoresDuplicados {

    static int[] noRepet(int[] vet) {
        int[] aux = new int[vet.length];
        int c = 0;
        
        for (int i = 0; i < vet.length; i++) {
            boolean jaExiste = false;
            
            for (int j = 0; j < aux.length; j++) {
                if (vet[i] == aux[j]) {
                    jaExiste = true;
                    break;
                }
            }
            
            if (!jaExiste) {
                aux[c] = vet[i];
                c++;
            }
        }
        
        int[] vet_semRepeticao = new int[c];
        for (int i = 0; i < vet_semRepeticao.length; i++) {
            if (aux[i] != 0) {
                vet_semRepeticao[i] = aux[i];
            }
        }
        
        return vet_semRepeticao;
    }
    
    public static void main(String[] args) {
        int[] vetor = {2, 2, 3, 3, 4, 4, 5, 5};
        int[] semRepet = noRepet(vetor);
        
        for (int i = 0; i < semRepet.length; i++) {
            System.out.print(semRepet[i] + ", ");
        }
    }
    
}
