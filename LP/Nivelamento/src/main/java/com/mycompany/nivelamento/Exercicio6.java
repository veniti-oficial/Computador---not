package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitorN = new Scanner(System.in);
        
        System.out.println("Digite seu salario bruto");
        double salario = leitorN.nextDouble();
        double desconto = salario / 100 * 30;
        salario = salario - desconto;
        
        System.out.println("Digite o valor da condução diaria");
        double  VT = leitorN.nextDouble();
        double VTtotal = (VT * 2) * 22;
        
        double resultado = salario - VTtotal;
        double totalD = desconto + VTtotal;
         
        String frase = String.format("Seu salario bruto é R$%.2f, tem um total de"
              + "R$%.2f e recebera um liquido de R$%.2f", salario, totalD, resultado);
        
        System.out.println(frase);
        
        
        
    }
            
}
