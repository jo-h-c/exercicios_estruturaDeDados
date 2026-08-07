package listaSimplesmenteEncadeada;

public class ListaLigada {
    private Celula cabeca;
    private Celula cauda;
    private int tamanho = 0;
    //tamanho - 1 == tamanho da lista("cheia")
    
    public ListaLigada() {
        this.cabeca = null;
        this.cauda = null;
    }

    public void inserir(int valor) {

        Celula novCelula = new Celula(valor);
        if (cabeca == null) {
            this.cabeca = novCelula;
            this.cauda = novCelula;
        } else {
            this.cauda.setProxima(novCelula);
            this.cauda = novCelula;
        }
        tamanho = tamanho + 1;
    }

    public void inserirNoComeco(int valor) {

        Celula novaCelula = new Celula(valor);
        if (cabeca == null) {
            this.cabeca = novaCelula;
            this.cauda = novaCelula;
        } else {
            novaCelula.setProxima(cabeca);
            this.cabeca = novaCelula;
        }
        this.tamanho = tamanho + 1;
    }

    public void inserirPorPosição(int valor, int posicao){
        Celula novaCelula = new Celula(valor);
        if(cabeca == null){
            this.cabeca = novaCelula;
            this.cauda = novaCelula;
        } else {
            //add o resto do codigo
        }
        this.tamanho = tamanho + 1;
    }

    public void removerInicio(){
        this.cabeca = cabeca.getProxima();
        this.tamanho = tamanho - 1;
    }

    public void removerPorPosição(int posicao){
        //add teste para ver se a posicao existe

        if(posicao == 0){
            removerInicio();
        } else if(posicao == tamanho-1){
            removerFim();
        } else {
            Celula auxiliar = this.cabeca;

            for(int i = 0; i < posicao - 1; i ++){
            auxiliar = auxiliar.getProxima();
            }
        
            auxiliar.setProxima(auxiliar.getProxima().getProxima());

            Celula removida = auxiliar.getProxima();
            removida.setProxima(null); 
        }
        this.tamanho = tamanho - 1;
    }

    public void removerFim(){
        Celula auxiliar = this.cabeca;

        for(int i = 0; i < this.tamanho-2; i ++){
            auxiliar = auxiliar.getProxima();
        }

        auxiliar.setProxima(null);
        this.cauda = auxiliar;
        this.tamanho = tamanho - 1;
    }

    public String toString(){
        if(this.tamanho == 0 ){
            return ("[]");
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Celula auxiliar = this.cabeca;

        for(int i = 0; i < this.tamanho - 1; i++ ){
            sb.append(auxiliar.getElemento());
            sb.append(", ");

            auxiliar = auxiliar.getProxima();
        } 

        sb.append(auxiliar.getElemento());
        sb.append("]");

        return sb.toString();
    }
}
