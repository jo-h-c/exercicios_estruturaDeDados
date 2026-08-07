package listaSimplesmenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();

        lista1.inserir(1);
        System.out.println(lista1.toString());
        
        lista1.inserir(2);
        System.out.println(lista1.toString());
    }
}
