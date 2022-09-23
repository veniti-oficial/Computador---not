package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Scanner leitor = new Scanner(System.in);
        //Integer soma = 0;
        
        //System.out.println("Digite um numero");
        //Integer Nescolhido = leitor.nextInt();
        
        //while(Nescolhido > 0){
        //    soma += Nescolhido;
        //  Nescolhido--;
        //}
        
        //System.out.println(soma);
        
        Scanner leitor = new Scanner(System.in);
        Integer soma = 0;
        
        System.out.println("Digite um numero");
        Integer numero = leitor.nextInt();
        soma += numero;
       
        while(numero != 0){
        System.out.println("Digite um numero");
        numero = leitor.nextInt();
        soma += numero;
        }
        
        String frase = String.format("O valor da soma é de %d", soma);
        
        System.out.println(frase);
    }
}
