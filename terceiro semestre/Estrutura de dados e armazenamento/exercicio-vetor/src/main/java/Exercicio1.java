import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Integer[] vetor = new Integer[7];
        Scanner leitor = new Scanner(System.in);

        for (Integer i = 0;i < vetor.length; i++){
            System.out.println("Digite um numero");
            vetor[i] = leitor.nextInt();
        }

        for(Integer i = 0; i < vetor.length; i++){
            System.out.println(vetor[i] + "\t");
        }
        System.out.println();

        for(Integer i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i] + "\t");
        }
        System.out.println();
    }
}
