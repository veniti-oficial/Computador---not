import java.util.Arrays;

public class Tentativa3 {
    public static void main(String[] args) {
        Integer[] vetor = {4, 7 ,5, 2, 8, 1, 6, 3};
        Arrays.sort(vetor);
        for (Integer i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
