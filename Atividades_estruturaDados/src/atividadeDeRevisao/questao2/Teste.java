package atividadeDeRevisão.questao2;

public class Teste {
    public static void main(String[] args) {
        Calcula numero = new Calcula();

        System.out.println("digite os numeros que voce quer add no vetor: ");
        numero.inserirNumeros();

        System.out.println("o resultado da soma de todos os numeros do vetor é " + numero.somarNumeros());
    }
}
