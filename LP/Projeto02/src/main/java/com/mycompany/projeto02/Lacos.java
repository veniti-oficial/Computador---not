package com.mycompany.projeto02;

import java.util.Scanner;

public class Lacos {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println("Numero gerado " + i);
        }
        
        for(int i = 10; i > 0; i--){
            System.out.println("Numero gerado " + i);
        }
        
        System.err.println("Acerte um numero");
        Scanner leitor = new Scanner(System.in);
        
        Integer numeroDigitado = leitor.nextInt();
        
        while(numeroDigitado != 42){
            System.out.println("Errouuu :( Tente novamente");
            numeroDigitado = leitor.nextInt();
        }
        
        System.out.println("Você acertou!!!");
    }
}
