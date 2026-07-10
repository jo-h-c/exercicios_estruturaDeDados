package atividade2;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float media;

        System.out.println("digite a nota 1: ");
        nota1 = scan.nextFloat();

        System.out.println("digite a nota 2: ");
        nota2 = scan.nextFloat();

        System.out.println("digite a nota 3: ");
        nota3 = scan.nextFloat();

        media = (nota1 + nota2 + nota3)/3;
    
        if (media >= 7) {
            System.out.println("APROVADO");
            System.out.println("media = " + media);
        }
        
        if (media >= 5 && media < 7) {
            System.out.println("TEM QUE FAZER RECUPERAÇÃO");
            System.out.println("media = " + media);
        }
        
        if (media < 5) {
            System.out.println("REPROVADO");
            System.out.println("media = " + media);
        }
    }
}
