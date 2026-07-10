import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, i, resultado;
        i=1;
        System.out.println("digite o numero que voce deseja saber a tabuada: ");
        num = scan.nextInt();

        while (i <= 10) {
            resultado = i*num;
            System.out.println(i + "x" + num + "=" + resultado);
            i = i + 1;
        }
    }
}
