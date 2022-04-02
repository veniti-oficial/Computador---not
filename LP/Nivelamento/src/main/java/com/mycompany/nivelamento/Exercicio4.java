package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitorN = new Scanner(System.in);
        Integer valorT = 0;
        Integer resultado = 0;
        
        System.out.println("Valor do produto");
        Integer Vproduto = leitorN.nextInt();
        
        System.out.println("Quantidade do produto");
        Integer Qproduto = leitorN.nextInt();
        valorT += Qproduto * Vproduto;
        
        System.out.println("Valor pago pelo cliente");
        Integer Vpago = leitorN.nextInt();
        resultado = Vpago - valorT;
        
        String frase = String.format("Seu troco é de %d", resultado);
        
        System.out.println(frase);
    }
}
