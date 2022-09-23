package com.mycompany.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio1 {
    public static void main(String[] args) {
/*        Scanner leitor = new Scanner(System.in);
        Integer numero = 0;
        Integer Nescolhido = 0;
        Integer contador2 = 0;
        
        

        
        for(Integer contador = 0; Nescolhido != numero ; contador++){
             Integer numero = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println("Digite um numero de 1 a 10");
            Nescolhido = leitor.nextInt();
            
            String frase = String.format("o numero sorteado foi %d", numero);
            System.out.println(frase);
        }
        
        if(contador2 <= 3){
            System.out.println("Você é muito sortudo");
        }else if(contador2 >= 4 && contador2 <= 10){
            System.out.println("Você é sortudo");
        }else{System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        
        System.out.println(contador2);*/



        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um numero de 0 a 10");
        Integer nEscolhido = leitor.nextInt();
        Integer nSorteado = ThreadLocalRandom.current().nextInt(0,11);
        String pFrase = String.format("O numero sorteado foi %d", nSorteado);
        System.out.println(pFrase);

        Integer contador = 0;
        
        while(nEscolhido != nSorteado){
        contador++;
            System.out.println("Selecione um numero novamente");
        nEscolhido = leitor.nextInt();
        nSorteado = ThreadLocalRandom.current().nextInt(0,11);
        String frase = String.format("O numero sorteado foi %d", nSorteado);
        System.out.println(frase);
        }
        
        
        if(contador <= 3){
            System.out.println("Você é muito sortudo");
        }else if(contador >= 4 && contador <= 10){
            System.out.println("Você é sortudo");
        }else{System.out.println("É melhor você parar de apostar e ir trabalhar");
        }


        
    }
}
