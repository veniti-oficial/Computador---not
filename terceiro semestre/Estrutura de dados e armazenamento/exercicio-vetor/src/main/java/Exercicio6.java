import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
//        Integer[] vetor = new Integer[365];
        Integer[] diaMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um dia do mês");
        Integer dia = leitor.nextInt();

        System.out.println("Digite um mês");
        Integer mes  = leitor.nextInt();

        Integer resposta = dia;

        for(Integer i = 0; i < mes - 1; i++) {
            resposta += diaMes[i];
        }

        System.out.println(String.format("O dia %d/%d corresponde ao dia %d do ano", dia, mes, resposta));
    }
}
