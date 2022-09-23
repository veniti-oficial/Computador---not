package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitorN = new Scanner(System.in);
        Integer pesoT = 0;
        //Integer pessoasT = 0;
        
        System.out.println("Peso maximo do elevador");
        Integer Pmaximo = leitorN.nextInt();
        Integer pesoMaximo = 0;
        
        
        System.out.println("Maximo de pessoas no elevador");
        Integer totalP = leitorN.nextInt();
        
        System.out.println("Peso da 1° pessoa");
        Integer pessoa1 = leitorN.nextInt();
        pesoMaximo += pessoa1;
        
        System.out.println("Peso da 2° pessoa");
        Integer pessoa2 = leitorN.nextInt();
        pesoMaximo += pessoa2;
        
        
        System.out.println("Peso da 3° pessoa");
        Integer pessoa3 = leitorN.nextInt();
        pesoMaximo += pessoa3;
        
        String frase = String.format("Entraram 3 pessoas no elevador, no qual"
                + " cabem %d\n O peso total no elevdor é de %d, sendo que ele "
                + "suporta %d", totalP, pesoMaximo, Pmaximo);
        
        System.out.println(frase);
    }
}
