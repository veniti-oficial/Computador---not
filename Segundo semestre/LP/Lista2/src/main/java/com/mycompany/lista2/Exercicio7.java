package com.mycompany.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
            Integer numeroSorteado = 0;
            Integer numeroPar = 0;
            Integer numeroImpar= 0;
        
        System.out.println("Digite um numero entre 1 a 100");
        Integer numeroEscolhido = leitor.nextInt();
        
        for(Integer i = 0; i < 200; i++){
            Integer random = ThreadLocalRandom.current().nextInt(0, 100);
            
            if(random == numeroEscolhido){
                numeroSorteado = i;
                System.out.println(numeroSorteado);
                break;
            }
            if(random % 2 == 0){
                numeroPar++;
            }
            if(random % 2 == 1){
                numeroImpar++;
            }
        }
        
        String frase = String.format("numeros pares = %d, numros Impares %d, "
                + "Sorteio campeão = %d", numeroPar, numeroImpar, numeroSorteado);
        
        System.out.println(frase);
    }
    
}
