import java.util.Scanner;

public class ExemploVetor {
    public static void exibirVetor(String[] v) {
        //Exibir o vetor
        for (int i = 0; i < v.length; i++) {
            System.out.println("vetor[" + i + "]=" + v[i] + "\t");
        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//        Criação do primeiro Vetor
        Integer[] vetor = new Integer[5];

        //Criação segundo vetor, com lista de valores
//        Integer[] vetor2 = {20, 30, 40, 50, 2738, 70, 80, 90};

        //Criação terceiro Vetor, String
//        String[] vetor3 = new String[4];



        //Preenchendo os valores do vetor
//        for(int i = 0; i < vetor.length; i++){
//            vetor[i] = i *10;
//        }

        //exibir vetor
        //exibirVetor(vetor);

        //exibi vetor 2
        //exibirVetor(vetor2);

        //Solicita que o usuario digita para preencher o valor
        for(Integer i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+ i +"]");
            vetor[i] = leitor.nextInt();
        }


//        for (Integer i = 0; i < vetor3.length; i++) {
//            System.out.println("vetor[" + i + "]");
//            vetor3[i] = leitor.next();
//        }

        //Exibe o terceiro vetor
//        for (String nome : vetor3) {
//            System.out.println(nome);
//        }
//        exibirVetor(vetor3);



        //Exercicio 1
        String[] vetor4 = {"segunda", "terça", "quarta", "quinta", "sexta", "sabado", "domingo"};

        System.out.println("Digite um numero");
        Integer numeroDigitado = leitor.nextInt();


        while (numeroDigitado < 1 || numeroDigitado > 7) {
            System.out.println("Digite um numero valido");
            numeroDigitado = leitor.nextInt();
        }
        System.out.println(vetor4[numeroDigitado - 1]);

        //Exercicio 2
        Integer total = 0;

        for(Integer i = 0; i < vetor.length; i++){
            total += vetor[i];
        }
        System.out.println("valor do primeiro vetor = " + total);

        //Exercicio 3
        Integer quantidade = 0;

        for(Integer i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                quantidade++;
            }
        }

        System.out.println("valor dos numeros pares = " + quantidade);

        System.out.println("Digite um numero maior ou igual a 2");
        Integer tamanho = leitor.nextInt();

        while (tamanho < 2) {
            System.out.println("Numero invalido, digite novamente");
            tamanho = leitor.nextInt();
        }

        //Criação do vet5
        Integer[] vetor5 = new Integer[tamanho];

    }

}


