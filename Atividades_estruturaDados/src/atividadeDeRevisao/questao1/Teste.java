package atividadeDeRevisão.questao1;

import atividadeDeRevisão.questao1.Metodos;

public class Teste {
    public static void main(String[] args) {
        Metodos listarnomes = new Metodos();

        System.out.println("digite os nomes para colocar no vetor: ");
        listarnomes.ler();

        System.out.println("os nomes que estão no vetor são: ");
        listarnomes.imprimirLista();

        System.out.println("o vetor em ordem alfabética é ");
        listarnomes.organizarNomes();
    }
}
