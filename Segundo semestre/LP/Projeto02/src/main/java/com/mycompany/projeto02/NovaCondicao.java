package com.mycompany.projeto02;

import java.util.Scanner;

public class NovaCondicao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número");
        Integer numeroDigitado= leitor.nextInt();
        
        
//        System.out.println(numeroDigitado);
        switch (numeroDigitado) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("Numero inválido");
                break;
        }
        
    }
}
