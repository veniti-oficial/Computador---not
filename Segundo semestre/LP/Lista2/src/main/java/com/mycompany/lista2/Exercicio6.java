package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Digite o numero base");
        Integer base = leitor.nextInt();
        
        System.out.println("Digite o numero expoente");
        Integer expoente = leitor.nextInt();
        
            Integer conta = base;
            
        for(Integer i = expoente; i != 0; i --){
            conta = base * conta;
            
            System.out.println(conta);
        }
    }
    
}
