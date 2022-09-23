import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Integer[] vetor = new Integer[10];
        Scanner leitor = new Scanner(System.in);
        Integer numeroEscolhido = 0;
        Integer qtdVezes = 0;

        for(Integer i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero para registro:");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Digite um numero para busca:");
        numeroEscolhido = leitor.nextInt();

        for(Integer i = 0; i < vetor.length; i++){
            if(vetor[i] == numeroEscolhido){
                qtdVezes++;
            }
        }

        System.out.println(String.format("o número %d ocorre %d vezes", numeroEscolhido, qtdVezes));
    }
}
