import java.lang.reflect.Array;
import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        int[] v1 = {1,3,4};
        int[] v2 = {6,7,5};

        Juntar juntar = new Juntar();

        System.out.println(Arrays.toString(juntar.juntarVetores(v1, v2)));
    }
}
