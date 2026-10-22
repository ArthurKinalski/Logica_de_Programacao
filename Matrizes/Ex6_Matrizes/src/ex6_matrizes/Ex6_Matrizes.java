package ex6_matrizes;

public class Ex6_Matrizes {

    public static void main(String[] args) {
        
        int num[][] = new int[15][5];
        
        for (int linha = 0; linha < 15; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                num[linha][coluna] = (int) (Math.random()*10);
            }
        }
        
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                int numero = num[i][j];
                int cont = 0;
                
                for (int linha = 0; linha < 15; linha++) {
                    for (int coluna = 0; coluna < 5; coluna++) {
                        if (num[linha][coluna] == numero) {
                            cont++;
                        }
                    }
                }
                
                boolean jaApareceu = false;
                for (int linha = 0; linha < i; linha++) {
                    for (int coluna = 0; coluna < 5; coluna++) {
                        if (num[linha][coluna] == numero) {
                            jaApareceu = true;
                        }
                    }
                }
                
                for (int coluna = 0; coluna < j; coluna++) {
                    if (num[i][coluna] == numero) {
                        jaApareceu = true;
                    }
                }
                
                if (cont > 1 && !jaApareceu) {
                    System.out.println("Numero: " + numero + " Repeticoes: " + cont);
                }
            }
        }
        
    }
    
}
