import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        String[] vetor = new String[10];
        String[] vetor2 = new String[10];
        Scanner leitor = new Scanner(System.in);


        Integer contador1 = 0, contador2 = 0;

        System.out.println("Digite um numero de alunos para adicionar Max:20");
        Integer alunos = 10;

        for (Integer i = 0; i <= alunos; i++){
            System.out.println("Digite o nome do aluno");
            String nome = leitor.next();
            System.out.println("Digite a turma");
            String turma = leitor.next();

            if(turma.equalsIgnoreCase("T1")) {
                if(contador1 >= 10){
                    System.out.println("Limite de alunos atingido");
                }else {
                    vetor[contador1] = nome;
                    contador1++;
                }
            } else if (turma.equalsIgnoreCase("T2")) {
                if(contador2 >= 10) {
                    System.out.println("Limite de alunos atingido");
                }else {
                    vetor2[contador2] = nome;
                    contador2++;
                }
            }else{
                System.out.println("Turma inválida");
            }
        }

        System.out.println(String.format("Turma t1 contem: %d alunos", contador1));
        for(Integer i = 0; i < contador1; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println(String.format("Turma t2 contem: %d alunos", contador2));
        for(Integer i = 0; i < contador2; i++) {
            System.out.println(vetor2[i]);
        }
    }
}
