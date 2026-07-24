package listaSimplesmenteEncadeada;

public class ListaLigada {
    private Celula cabeca;
    private Celula cauda;
    
    public ListaLigada() {
        this.cabeca = null;
        this.cauda = null;
    }

    public void inserir(int valor) {

        Celula novCelula = new Celula(valor);
        if (cabeca == null) {
            cabeca = novCelula;
            cauda = novCelula;
        } else {
            cauda.setProxima(novCelula);
            cauda = novCelula;
        }
    }

    public void inserirNoComeco(int valor) {

        Celula novaCelula = new Celula(valor);
        if (cabeca == null) {
            cabeca = novaCelula;
            cauda = novaCelula;
        } else {
            novaCelula.setProxima(cabeca);
            cabeca = novaCelula;
        }
    }

}
