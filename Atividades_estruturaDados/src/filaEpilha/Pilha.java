package filaEpilha;

import java.util.LinkedList;

public class Pilha {
    LinkedList<String> pilha = new LinkedList<>();

    public void inserir(String e){
        pilha.push(e);
    }

    public String remover(){
        if(verificar()){
            System.out.println("A pilha está vazia");
        } else {
            return pilha.pop();
        }
        return null;
    }

    public boolean verificar(){
        if(this.pilha.isEmpty()){
            return true;
        }
        return false;
    }

    public void mostrar(){
        if(verificar()){
            System.out.println("a pilha esta vazia");
        } else {
            System.out.println("pilha: " + pilha);
        }
    }
}
