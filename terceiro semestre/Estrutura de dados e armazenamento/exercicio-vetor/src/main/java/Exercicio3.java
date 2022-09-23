import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String[] vetor = new String[10];
        Scanner leitor = new Scanner(System.in);
        String nome = "";

        for(Integer i = 0; i < vetor.length; i++){
            System.out.println("Digite um nome:");
            vetor[i] = leitor.next();
        }

        System.out.println("Digite um nome para busca");
        nome = leitor.next();

        String resultado = "Nome não encontrado";


        for(Integer i = 0; i < vetor.length; i++){
            if(vetor[i].equals(nome)) {
                resultado = String.format("Nome encontrado no índice %d", i);
            }
        }
        System.out.println(resultado);
    }
}
