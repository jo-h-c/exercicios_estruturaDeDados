package listaDuplaEncadeada;

public class ListaLigada {
    private Celula cabeca;
    private Celula cauda;
    private int tamanho = 0;

    public void inserir(int valor) {

        Celula novCelula = new Celula(valor);
        if (cabeca == null) {
            this.cabeca = novCelula;
            this.cauda = novCelula;
        } else {
            this.cauda.setProxima(novCelula);
            novCelula.setAnterior(cauda);
            this.cauda = novCelula;
        }
        tamanho = tamanho + 1;
    }
}
