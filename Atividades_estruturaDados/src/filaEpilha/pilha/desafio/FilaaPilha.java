package filaEpilha.pilha.desafio;

import java.util.LinkedList;
import java.util.Stack;

public class FilaaPilha {
    Stack<String> pilha = new Stack<>();
    LinkedList<String> fila = new LinkedList<>();
    int quantidade = 0;

    public void inserir(String e) {
        fila.addLast(e);
        quantidade++;
    }

    public String remover() {

        if (verificar()) {
            System.out.println("A lista está vazia");
            return null;
        } 
        else {
            quantidade--;
            return fila.removeFirst();
        }
    }

    public boolean verificar() {

        if (this.fila.isEmpty()) {
            return true;
        }

        return false;
    }

    public void mostrar() {

        if (verificar()) {
            System.out.println("A lista está vazia");
        } 
        else {
            System.out.println("Fila: " + fila);
        }
    }

    public void inverter() {

        while (!fila.isEmpty()) {
            pilha.push(fila.removeFirst());
        }

        while (!pilha.isEmpty()) {
            fila.addLast(pilha.pop());
        }
    }

    public boolean verificarPalindromo(){
        FilaaPilha original = new FilaaPilha();
        FilaaPilha invertida = new FilaaPilha();
        
        if () {
            
            return true;
        } else {
            return false;
        }
    }
}
