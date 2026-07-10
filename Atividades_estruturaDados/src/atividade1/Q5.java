import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("digite um numero: ");
        num = scan.nextInt();

        if(num%2 == 0) {
            System.out.println("o numero é par");
        } else if(num%2 != 0) {
            System.out.println("o numero é impar");
        } 

        if ((num != 2) && ((num%2 == 0) || (num%3 == 0) || (num%5 == 0))){
            System.out.println("o numero nâo é primo");
        } else {
            System.out.println("o numero é primo");
        }
    }

}
