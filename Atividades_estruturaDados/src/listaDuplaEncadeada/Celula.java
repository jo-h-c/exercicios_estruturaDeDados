package listaDuplaEncadeada;

public class Celula {
    private Celula proxima;
    private Celula anterior;
    private int valor;

    public Celula(Celula proxima, Celula anterior, int valor) {
        this.proxima = proxima;
        this.anterior = anterior;
        this.valor = valor;
    }
    
    public Celula() {}

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
