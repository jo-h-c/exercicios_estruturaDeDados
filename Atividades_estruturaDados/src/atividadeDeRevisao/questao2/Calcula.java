package atividadeDeRevisão.questao2;

import java.util.Scanner;

public class Calcula {
    Scanner scan = new Scanner(System.in);
    int num;
    int[] numeros = new int[10];
    int result = 0;

    public void inserirNumeros(){
        for(int i = 0; i<10; i++){
            num = scan.nextInt();
            numeros[i] = num;
        }
    }

    public int somarNumeros(){
        for(int j = 0 ; j<10; j++){
            result = result + numeros[j];
        }
        return result;
    }
}
