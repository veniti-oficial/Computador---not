package com.mycompany.lista3;

import java.util.Scanner;

public class ClassesSociais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        metodosLista2 quantidadeSalario = new metodosLista2();
        
        System.out.println("Digite sua renda");
        Double salarioDigitado = leitor.nextDouble();
        
        System.out.println(String.format("Você recebe aproximadamente %.2f salários"
                + " minimos", quantidadeSalario.salariosMinimo(salarioDigitado)));
        
        quantidadeSalario.classePertencida(salarioDigitado);
        
        //System.out.println(String.format("%s", 
        //        quantidadeSalario.classePertencida(salarioDigitado));
    }
    
    
    
}
