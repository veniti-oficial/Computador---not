import java.util.Arrays;

public class Tentativa2 {
    public static void main(String[] args) {
        Integer[] vetor = {4, 7 ,5, 2, 8, 1, 6, 3};
        Integer indMenor = 0;

        for(Integer i = 0; i < vetor.length - 1; i++){
            indMenor = i;
            for (Integer j = i + 1; j < vetor.length; j++) {
                if(vetor[j] < vetor[indMenor]) {
                    indMenor = j;
//                    Integer aux = vetor[i];
//                    vetor[i] = vetor[j];
//                    vetor[j] = aux;
                }
            }
            vetor[i] = vetor[indMenor];
            System.out.println(vetor[i]);

        }

    }
}
