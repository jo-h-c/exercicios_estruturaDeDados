package fila;

public class Main {
    public static void main(String[] args) {
        Estrutura fila = new Estrutura();

        fila.inserir("joh");
        fila.inserir("hana");
        fila.inserir("ste");
        fila.inserir("mp");

        fila.mostrar();

        fila.remover();
        
        fila.mostrar();
    }
}
