package com.mycompany.nivelamento;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitorN = new Scanner(System.in);
        Integer soma = 0;
        Integer subtracao = 0;
        Integer multiplicacao = 0;
        Integer divisao = 0;
        
        
        System.out.println("Digite um numero");
        Integer N1digitado = leitorN.nextInt();
        
        System.out.println("Digite um segundo numero");
        Integer N2digitado = leitorN.nextInt();
        
        soma = N1digitado + N2digitado;
        subtracao = N1digitado - N2digitado;
        multiplicacao = N1digitado * N2digitado;
        divisao = N1digitado / N2digitado;
        
        String frase = String.format("Resultado da soma: %d \n Resultado"
                + "da subtração = %d \n Resultado da multiĺicação = %d \n "
                + "Resultado da divisão = %d \n", soma, subtracao, multiplicacao,
                divisao);
        
        System.out.println(frase);
    }
}
