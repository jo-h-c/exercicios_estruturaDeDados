
public class Juntar {
    public int[] juntarVetores(int[] vetor1, int[] vetor2){
        int tamanhoTotal = vetor1.length + vetor2.length;
        int[] vetorNovo = new int[tamanhoTotal];

        System.arraycopy(vetor1, 0 , vetorNovo, 0, vetor1.length);
        System.arraycopy(vetor2, 0 , vetorNovo, vetor1.length, vetor2.length);

        return vetorNovo;
    }
}
