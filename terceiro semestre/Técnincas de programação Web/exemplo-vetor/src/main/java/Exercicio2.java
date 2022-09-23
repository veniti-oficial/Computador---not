import java.util.Scanner;

public class Exercicio2 {

    public static void exibirVetor(Integer[] v) {
        //Exibir o vetor
        for (Integer i = 0; i < v.length; i++) {
            System.out.print("vetor[" + i + "]=" + v[i] + "\t");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer[] vetor = new Integer[10];
        Scanner leitor = new Scanner(System.in);
        Integer media = total / vetor.length;

        for(Integer i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero");
            vetor[i] = leitor.nextInt();
            total += vetor[i];
        }
    exibirVetor(vetor);

    }
}
