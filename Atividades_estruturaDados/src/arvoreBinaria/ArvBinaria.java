package arvoreBinaria;

public class ArvBinaria {
    private static class No {
        int valor;
        No esquerda;
        No direita;

        public No(int valor) {
            this.valor = valor;
        }
    }

    private No raiz;

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }

        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        }

        return atual;
    }

    public int buscarMenor() {
        if (raiz == null) {
            throw new IllegalStateException("A árvore está vazia");
        }

        return buscarMenorRecursivo(raiz);
    }

    private int buscarMenorRecursivo(No atual) {
        if (atual.esquerda == null) {
            return atual.valor;
        }

        return buscarMenorRecursivo(atual.esquerda);
    }
}
