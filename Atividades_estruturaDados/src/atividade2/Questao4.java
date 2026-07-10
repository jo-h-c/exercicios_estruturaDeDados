package atividade2;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia;
        int tempo;
        int velocidade;

        System.out.println("digite a distancia(em metros): ");
        distancia = scanner.nextInt();

        System.out.println("digite o tempo(em segundos): ");
        tempo = scanner.nextInt();

        velocidade = distancia/tempo;

        System.out.println("a velocidade media é " + velocidade + " m/s");
    }
}
