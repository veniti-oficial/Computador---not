package com.mycompany.lista3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DescontoProgressivo desconto = new DescontoProgressivo();
        
        System.out.println("Valor do produto");
        Double valorDigitado = leitor.nextDouble();
        
        System.out.println("Quantidade do produto");
        Integer quantidadeDigitado = leitor.nextInt();
        
        String x = desconto.teste();
        System.out.println(String.format("%s \n Valor do produto: R$%.2f \n"
                + " quantidade: %d \n %s \n valor total com desconto R$%.2f"
                ,desconto.teste(), valorDigitado, quantidadeDigitado,desconto.teste(),
                        desconto.ExibirNotaFiscal
                            (valorDigitado, quantidadeDigitado)));
        
        
        
    }
    
}
