package arvoreBinaria;

public class Principal {
    public static void main(String[] args) {

        ArvBinaria arv = new ArvBinaria();

        arv.inserir(56);
        arv.inserir(11);
        arv.inserir(89);
        arv.inserir(27);
        arv.inserir(34);
        arv.inserir(76);
        arv.inserir(94);

        System.out.println("o menor valor da árvore é " + arv.buscarMenor());
    }
}
