package com.mycompany.lista2;

public class Exercicio9 {
    public static void main(String[] args) {
        for(Double i = 0.00; i <= 5; i += 0.15){
            String frase = String.format("%.2f", i);
            System.out.println(frase);
        }
    }
    
}
