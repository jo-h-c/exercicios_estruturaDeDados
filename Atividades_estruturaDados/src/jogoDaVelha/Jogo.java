package jogoDaVelha;

public class Jogo {
    private Tabuleiro tabuleiro;

    public Jogo() {
        tabuleiro = new Tabuleiro();
    }


    public boolean verificarVitoria(char simbolo) {

        char[][] matriz = tabuleiro.getMatriz();

        // vitoria por linhas
        for (int i = 0; i < 3; i++) {

            if (matriz[i][0] == simbolo && matriz[i][1] == simbolo && matriz[i][2] == simbolo) {
                return true;
            }
        }


        // vitoria por colunas

        for (int i = 0; i < 3; i++) {

            if (matriz[0][i] == simbolo && matriz[1][i] == simbolo && matriz[2][i] == simbolo) {
                return true;
            }
        }


        // vitoria por diagonal principal (\)

        if (matriz[0][0] == simbolo && matriz[1][1] == simbolo && matriz[2][2] == simbolo) {
            return true;
        }


        // vitoria por  diagonal secundária(/)

        if (matriz[0][2] == simbolo && matriz[1][1] == simbolo && matriz[2][0] == simbolo) {
            return true;
        }
        return false;
    }


    public boolean verificarEmpate() {

        char[][] m = tabuleiro.getMatriz();//pega matriz


        for(int linha = 0; linha < 3; linha++) {//percorre matriz

            for(int coluna = 0; coluna < 3; coluna++) {


                if(m[linha][coluna] == ' ') {// se a casa tiver vazia o jogo continua

                    return false;
                }
            }
        }

        return true; // se olhar tudo e não tiver vitória é empate
    }


    public Tabuleiro getTabuleiro() {

        return tabuleiro;
    }
}
