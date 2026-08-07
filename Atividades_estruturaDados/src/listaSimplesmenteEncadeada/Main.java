package listaSimplesmenteEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaLigada lista1 = new ListaLigada();

        lista1.inserir(1);
        System.out.println(lista1.toString());
        
        lista1.inserir(2);
        System.out.println(lista1.toString());
        
        lista1.inserir(4);
        System.out.println(lista1.toString());
        
        lista1.inserirNoComeco(5);
        System.out.println(lista1.toString());
        
        //lista1.inserirPorPosição(9, 2); - tem que fazer
        //System.out.println(lista1.toString());
        
        lista1.removerFim();
        System.out.println(lista1.toString());

        lista1.inserir(4);
        System.out.println(lista1.toString());
        
        lista1.removerInicio();
        System.out.println(lista1.toString());
        
        lista1.removerPorPosição(1);
        System.out.println(lista1.toString());
    }
}
