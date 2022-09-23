import java.util.Scanner;

public class Exercicios {

    public static void exibirVetor(Integer[] v) {
        //Exibir o vetor
        for (Integer i = 0; i < v.length; i++) {
            System.out.println("vetor[" + i + "]=" + v[i] + "\t");
        }
    }

    public static void exibirVetorContrario(Integer[] v) {
        //Exibir o vetor
        for (Integer i = v.length; i > 0; i--) {
            System.out.println("vetor[" + i + "]=" + v[i - 1] + "\t");
        }
    }

    public static void main(String[] args) {
        Integer[] vetor = new Integer[7];
        Scanner leitor = new Scanner(System.in);

        for(Integer i = 0; i < 7; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero");
            vetor[i] = leitor.nextInt();
        }
        exibirVetor(vetor);
        exibirVetorContrario(vetor);

    }
}
