package com.mycompany.lista3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        metodosLista2 trazerIdade = new metodosLista2();
        
        System.out.println("Digite sua idade");
        Integer idade = leitor.nextInt();
        
        trazerIdade.classificaldade(idade);
    }
    
}
