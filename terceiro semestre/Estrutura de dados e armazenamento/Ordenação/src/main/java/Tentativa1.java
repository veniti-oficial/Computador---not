public class Tentativa1 {
    public static void main(String[] args) {
        Integer[] vetor = {4, 7 ,5, 2, 8, 1, 6, 3};

        for(Integer i = 0; i < vetor.length; i++){
            for (Integer j = i + 1; j < vetor.length; j++) {
                if(vetor[j] < vetor[i]) {
                    Integer aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
            System.out.println(vetor[i]);
        }
    }
}
