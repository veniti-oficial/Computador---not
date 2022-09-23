import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Integer[] vetor = new Integer[10];
        Scanner leitor = new Scanner(System.in);
        Integer total = 0;
        Integer media = 0;

        for(Integer i = 0; i < vetor.length; i++){
            System.out.println("Digite um numero:");
            vetor[i] = leitor.nextInt();
        }

        for(Integer i = 0;i < vetor.length; i++){
            total += vetor[i];
        }
        media = total / vetor.length;
        System.out.println(String.format("Valor da média é = %d", media));

        for(Integer i = 0; i < vetor.length; i++){
            if(vetor[i] > media){
                System.out.println(vetor[i]);
            }
        }
    }
}
