package com.mycompany.lista3;

public class Exercicio1Main {
    public static void main(String[] args) {
        Exercicio1 media = new Exercicio1();
        
        String frase = String.format("a média é = %.2f", media.media(6.00, 
                5.00));
        
        System.out.println(frase);
    }
}
