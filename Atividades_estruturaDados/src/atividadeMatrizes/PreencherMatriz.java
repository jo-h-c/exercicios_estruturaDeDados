package atividadeMatrizes;

import java.util.Scanner;

public class PreencherMatriz {
    int matriz [] [] = new int[3][2];
    int linha;
    int coluna;

    Scanner scan  = new Scanner(System.in);

    public void encherMatriz() {
        for(linha = 0; linha<matriz.length; linha++){
            for (coluna = 0; coluna < matriz[0].length; coluna ++){
                matriz[linha] [coluna] = scan.nextInt();
            }
        }
    }

    public void mostrarMatriz(){
        for (linha = 0; linha<matriz.length; linha++){
            System.out.print("|" + matriz[linha][0]);
            System.out.println("|" + matriz[linha][1] + "|");
        }
    }
}
