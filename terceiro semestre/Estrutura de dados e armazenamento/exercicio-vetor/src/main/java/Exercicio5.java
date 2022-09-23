import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        String[] vetor = new String[5];
        Integer[] vetor2 = new Integer[5];
        Scanner leitor = new Scanner(System.in);



        System.out.println("Digite 5 nomes de veiculos...");
        for(Integer i = 0; i < vetor.length; i++) {
            System.out.println(String.format("Veiculo numero %d", i + 1));
            vetor[i] = leitor.next();
        }

        System.out.println("Digite o rendimento dos veiculos...");
        for(Integer i = 0; i < vetor2.length; i++) {
            System.out.println(String.format("Veiculo numero %d", i + 1));
            vetor2[i] = leitor.nextInt();
        }

        // Podia ter adicionado os valores nos vetores em um "for" só ao invés de criar 2

        Integer posicaoMaior = 0;
        for(Integer i = 0; i < vetor2.length; i++) {
            if(vetor2[i] > vetor2[posicaoMaior]) {
                posicaoMaior = i;
            }
        }

        System.out.println(String.format("O carro com mais rendimento é %s com Rendimento de %d", vetor[posicaoMaior], vetor2[posicaoMaior]));
    }
}
