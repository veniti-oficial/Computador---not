package com.mycompany.lista3;

import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        calcularPesoIdeal resultado = new calcularPesoIdeal();
        
        
        System.out.println("Digite seu Gênero M ou F");
        String genero = leitor.nextLine();
        
        System.out.println("Digite sua altura");
        double altura = leitor.nextDouble();
        
        Double peso = resultado.peso(genero, altura);
        
        System.out.println(String.format("seu peso ideal é de %.2f", 
                peso));
        
    }
    
}
