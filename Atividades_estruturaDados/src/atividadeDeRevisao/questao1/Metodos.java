package atividadeDeRevisão.questao1;

import java.util.Arrays;
import java.util.Scanner;

public class Metodos {
    Scanner scan = new Scanner(System.in);
    String nome;
    String[] nomes = new String[10];
    
    public void ler(){
        for(int i = 0; i<10; i++){
            nome = scan.nextLine();
            nomes[i] = nome;
        }
    } 

    public void imprimirLista(){
        System.out.println((Arrays.toString(nomes)));
    }

    public void organizarNomes(){
        Arrays.sort(nomes);
        System.out.println((Arrays.toString(nomes)));
    }
}
