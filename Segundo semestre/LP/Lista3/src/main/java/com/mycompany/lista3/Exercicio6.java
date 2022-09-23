package com.mycompany.lista3;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        verificarPrimo nPrimo = new verificarPrimo();

        System.out.println("Digite para verificar se o numero é primo ou não, "
                + "digite um numero negativo para sair");
        Integer numeroDigitado = leitor.nextInt();

        if (numeroDigitado > 0) {
            if (nPrimo.numeroPrimo(numeroDigitado) > 2) {
                System.out.println("Numero não é primo");
            } else {
                System.out.println("Numero é primo");
            }
        } else if (numeroDigitado < 0) {
            System.out.println("Programa encerrado");
        } else {
            System.out.println("numero invalido");
        }
    }
}
