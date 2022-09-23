package com.mycompany.projeto3;

import java.util.Scanner;

public class Utilitária {

    Scanner leitor = new Scanner(System.in);

    // assinatura do método
    void exibirLinha() {
        // corpo do metodo
        System.out.println("*".repeat(20));

    }

    void somarNumeros(Integer n1, Integer n2) {
//        Integer n1 = leitor.nextInt();
//        Integer n2 = leitor.nextInt();
        Integer soma = n1 + n2;

        System.out.println(soma);
    }

}
