package jogoDaVelha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo(); //chamar jogo
        Scanner scan = new Scanner(System.in);


        System.out.println("----- JOGO DA VELHA -----\n");
        System.out.println("Iniciando...\n");

        System.out.println("digite o nome dos jogadores");
        System.out.println("1° JOGADOR(X): ");
        Jogador jogador1 = new Jogador(scan.nextLine(), 'X');
        System.out.println("Jogador 1: Nome: " + jogador1.getNome() + " | Simbolo: " + jogador1.getSimbolo());
        
        System.out.println("2° JOGADOR(O): ");
        Jogador jogador2 = new Jogador(scan.nextLine(), 'O');
        System.out.println("Jogador 2: Nome: " + jogador2.getNome() + " | Simbolo: " + jogador2.getSimbolo());

        
        Jogador atual = jogador1; //declara jogador atual


        while(true) {


            jogo.getTabuleiro().mostrar();


            System.out.println("Vez de: " + atual.getNome() + " Símbolo: " + atual.getSimbolo());


            System.out.print("Escolha a linha (de 0 a 2) para colocar seu símbolo: ");
            int linha = scan.nextInt();


            System.out.print("Escolha a coluna (de 0 a 2) para colocar seu símbolo: ");
            int coluna = scan.nextInt();

            boolean jogou = jogo.getTabuleiro().colocarSimbolo(linha, coluna, atual.getSimbolo()); //pega linha e coluna escolhidos e coloca o símbolo do atual

            if(!jogou) {//se a jogada n der certo...

                System.out.println("\n Posição ocupada! Tente novamente: ");
                continue;
            }

            if(jogo.verificarVitoria(atual.getSimbolo())) {

                jogo.getTabuleiro().mostrar();

                System.out.println(
                    atual.getNome() + " VENCEU");

                break;
            }


            if(jogo.verificarEmpate()) {

                jogo.getTabuleiro().mostrar();

                System.out.println("EMPATE");

                break;
            }

            if(atual == jogador1) {//inverte p proximo jogador

                atual = jogador2;

            } else {

                atual = jogador1;
            }

        }
    }
}
