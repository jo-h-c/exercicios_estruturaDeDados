package atividade2;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int anonascimento;
        int anoatual;
        int idade;

        System.out.println("digite o seu ano de nascimento:");
        anonascimento = scan.nextInt();

        System.out.println("digite o ano atual: ");
        anoatual = scan.nextInt();

        idade = anoatual - anonascimento;
        System.out.println("voce tem " + idade + " anos");
    }
}
