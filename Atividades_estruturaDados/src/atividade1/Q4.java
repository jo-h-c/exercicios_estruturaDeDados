package atividade1;
public class Q4 {
    public static void main(String[] args) {
        int i, impar, par;
        impar = 0;
        par = 1;

        for(i=0 ; i<=30 ; i++){
            if(i%2 == 0 ){
                par = par*i;
            } else {
                impar = impar+i;
            }
        }
        
        System.out.println("a soma dos impares é " + impar);
        System.out.println("a multiplicação dos pares é " + par);
    }
}
