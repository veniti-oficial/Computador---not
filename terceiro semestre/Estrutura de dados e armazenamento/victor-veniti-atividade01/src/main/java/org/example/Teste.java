package org.example;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        ListaObj<Veiculo> concessionaria = new ListaObj(5);
        Scanner leitor = new Scanner(System.in);
        Integer opcao = null;


        do{
            System.out.println("Escolha a opção desejada: (digite 1, 2 ou 3)");
            System.out.println("1 - Adicionar um veiculo");
            System.out.println("2 - Exibir lista de veiculos");
            System.out.println("3 - Sair");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o numero do veiculo");
                    int id = leitor.nextInt();

                    System.out.println("Digite a marca do veículo");
                    String marca = leitor.next();

                    System.out.println("Digite o modelo do veiculo");
                    String modelo = leitor.next();

                    System.out.println("Digite o ano do veiculo");
                    Integer ano = leitor.nextInt();

                    System.out.println("Digite cv do veiculo");
                    Integer cv = leitor.nextInt();

                    System.out.println("Digite o valor do veiculo");
                    Double valor = leitor.nextDouble();

                    concessionaria.adiciona(new Veiculo(id,marca,modelo,ano,cv,valor));

                    System.out.println("Veiculo adicionado");
                    break;
                case 2:
                    System.out.println("");
                    System.out.printf("%-6s %-5s %10s %5s %5s %5s \n", "NUMERO", "MARCA", "MODELO", "ANO", "CV", "VALOR");
                    for (int i = 0; i < concessionaria.getTamanho(); i++){
                        Veiculo veiculo = concessionaria.getElemento(i);
                        System.out.printf("%06d %-5s %10s %5s %5d %5.2f \n", veiculo.getId(),veiculo.getMarca(), veiculo.getModelo(), veiculo.getAno(), veiculo.getCv(), veiculo.getValor());
                    }
                    System.out.printf("");
                    break;
                case 3:
                    System.out.println("Veiculo cadastrado com sucesso!");
                    break;
                default:
                    System.out.println("Opção digitada inválida");
                    break;
            }
        } while (opcao != 3);
    }
}
