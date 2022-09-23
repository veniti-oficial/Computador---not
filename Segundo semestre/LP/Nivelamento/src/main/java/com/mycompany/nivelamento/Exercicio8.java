package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitorS = new Scanner(System.in);
        Scanner leitorN = new Scanner(System.in);
        double media = 0.00;
        
        System.out.println("Nome do usuario");
        String nome = leitorS.next();
        
        System.out.println("Nota 1");
        Integer nota1 = leitorN.nextInt();
        media += nota1;
        
        System.out.println("Nota 2");
        Integer nota2 = leitorN.nextInt();
        media += nota2;
        
        String frase = String.format("Olá, %s Sua média foi de %.2f", nome
                , media / 2);
        
        System.out.println(frase);
        
    }
}
