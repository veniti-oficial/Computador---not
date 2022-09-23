package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitorS = new Scanner(System.in);
        Scanner leitorN = new Scanner(System.in);
        
        System.out.println("Digite seu login");
        String login = leitorS.next();
        
        System.out.println("Digite sua senha");
        String senha = leitorS.next();
        
        System.out.println("Quantas vezes pode errar a senha");
        Integer limite = leitorN.nextInt();
        
        String frase = String.format("Seu login é %s, e sua senha é %s, Você "
                + "tem %d de tentativas", login,senha,limite);
                
        System.out.println(frase);
                
                
    }
}
