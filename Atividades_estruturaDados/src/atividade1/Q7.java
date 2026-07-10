package atividade1;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int horas;
        double valor, salario;
        valor = 12.25;
        
        System.out.println("digite a quantidade de horas que voce trabalhou: ");
        horas = scan.nextInt();
        salario = valor * horas;
        System.out.println("o seu salario é: " + salario);
        if (salario<50) {
            System.out.println("dirija-se a direção do hotel");
        }5
    }
}
