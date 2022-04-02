package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o numero da tabuada");
        Integer numeroEscolhido = leitor.nextInt();
        
        for(Integer i = 1; i <= 10; i++){
            Integer conta = i * numeroEscolhido;
            
            String frase = String.format("%d x %d = %d", numeroEscolhido, i, 
                    conta);
            
            System.out.println(frase);
        }
    }
    
}
