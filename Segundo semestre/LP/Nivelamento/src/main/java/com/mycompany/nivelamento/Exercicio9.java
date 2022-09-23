package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
       Scanner leitorS = new Scanner(System.in);
       Scanner leitorN = new Scanner(System.in);
       
       System.out.println("Digite seu nome");
       String nome = leitorS.next();
       
       System.out.println("Olá, " + nome +" Qual o ano do seu Nascimento?");
       Integer idadeAtual = leitorN.nextInt();
       
       Integer resultado = 2030 - idadeAtual;
       
       String frase = String.format("Em 2030 você terá %d", resultado);
       
       System.out.println(frase);
       
    }
}
