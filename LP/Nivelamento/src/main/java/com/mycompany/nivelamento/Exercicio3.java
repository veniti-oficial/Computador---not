package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitorN = new Scanner(System.in);
        Integer totalCal = 0;
        Integer totalMin = 0;
        
        System.out.println("Tempo que passou se aquecendo");
        Integer aquecendo = leitorN.nextInt();
        totalMin += aquecendo;
        totalCal += aquecendo * 12; 
        
        System.out.println("Tempo de exercicio aeróbico");
        Integer aerobico = leitorN.nextInt();
        totalMin += aerobico;
        totalCal += aerobico * 20;
        
        System.out.println("Tempo de musculação");
        Integer musculacao = leitorN.nextInt();
        totalMin += musculacao;
        totalCal += musculacao * 25;
        
        String frase = String.format("Olá, Jorge. Você fez um total de %d minutos,"
                + "de exercicios e perdeu cerca de %d calorias ",
                totalMin, totalCal);
        
        System.out.println(frase);
        
    }
}
