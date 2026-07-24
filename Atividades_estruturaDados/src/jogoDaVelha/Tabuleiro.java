package jogoDaVelha;

public class Tabuleiro {
    char[][] matriz;

    public Tabuleiro() {
        matriz = new char[3][3];
        inicializar();
    }


    public void inicializar() {

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                matriz[linha][coluna] = ' '; 
            }
        }
    }


    public void mostrar() {        
        System.out.println("\n Tabuleiro do jogo: \n");

        System.out.println(" 0 " + "  1 " + "  2 ");

        for (int linha = 0; linha < matriz.length; linha++) {

            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                System.out.print(" " + matriz[linha][coluna]);

                if (coluna < 2) {
                    System.out.print(" |");
                }
            }

            System.out.println();

            if (linha < 2) { 
                System.out.println("____________");
            }
        }

        System.out.println("\n");
    }


    public boolean colocarSimbolo(int linha, int coluna, char simbolo) {

        if (matriz[linha][coluna] == ' ') {

            matriz[linha][coluna] = simbolo;
            return true;
        }

        return false;
    }


    public char[][] getMatriz() {

        return matriz;
    }
}
