package atividadeRecursaoBinario;

public class Binario {
    public static int converter(int binario) {
        if (binario == 0) {
            return 0;
        }

        return (binario % 10) + 2 * converter(binario / 10);
    }
}
