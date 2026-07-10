package atividade3.questao1;

import java.util.Arrays;

public class CadastrarConta {
    Conta[] contas = new Conta[3];
    
    int totalElementos = 0;

    public void addConta(Conta conta){
        aumentarVetor();
        contas[totalElementos] = conta;
        totalElementos ++;
    }

    public void listarContas(){
        System.out.println(Arrays.toString(contas));
    }

    public Conta procurarConta(String nome){
        for (int i=0; i<totalElementos; i++){
            if(contas[i].getNome().equals(nome)){
                return contas[i];
            }
        }
        return null;
    }

    public void addPosicao(Conta conta, int posicao){
        aumentarVetor();
        for (int cont=totalElementos-1; cont >= posicao; cont--){
            contas[cont+1] = contas[cont];
        }
        contas[posicao] = conta;
        totalElementos ++;
    }

    public void removerConta(Conta conta, int posicao){
        for(int cont = totalElementos - 1;cont >= posicao; cont --){
            contas[posicao+1] = contas[posicao];
            contas[cont]= null;
        }
        totalElementos --;
    }

    private void aumentarVetor(){
        if(totalElementos == contas.length){
            Conta[] nContas = new Conta[totalElementos*2];
            for(int i = 0; i < totalElementos; i++){
                nContas[i] = contas[i];
            }
            //ao inves de usar esse for, voce pode usar: System.arraycopy(contas, 0, nContas, 0, contas.lenght)
            contas = nContas;
        }
    }

    public void imprimirVetor(Conta ){

    }
}
