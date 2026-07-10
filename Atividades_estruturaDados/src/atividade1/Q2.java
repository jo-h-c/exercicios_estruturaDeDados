import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char sim;
        int n1, n2, resultado;
        resultado=0;
        
        System.out.println("digite o primeiro numero: ");
        n1 = scan.nextInt();
        
        System.out.println("digite o segundo numero: ");
        n2 = scan.nextInt();

        System.out.println("digite o tipo de operação: ");
        sim = scan.next().charAt(0);

        if (sim == '*') {
            resultado = n1*n2;

        } else if (sim == '/') {
            resultado = n1/n2;

        } else if (sim == '+') {
            resultado = n1+n2;

        } else if (sim == '-') {
            resultado = n1-n2;

        } else {
            System.out.println("caracter inválido");
        }

        System.out.println("resultado é igual a  " + resultado);
    }
}
