package com.mycompany.lista3;

public class metodosLista2 {

    Double salariosMinimo(Double salario) {
        return salario / 1100;
    }

    void classePertencida(Double classe) {

        if (classe < 2090.00) {
            System.out.println("Você pertence a classe E");
        } else if (classe > 2090.01 && classe < 4180.00) {
            System.out.println("Você pertence a clase D");
        } else if (classe > 4180.01 && classe < 10450.00) {
            System.out.println("Você pertence a classe C");
        } else if (classe > 10450.01 && classe < 20900.00) {
            System.out.println("Você pertence a classe B");
        } else {
            System.out.println("Você pertence a classe A");
        }
    }

    void classificaldade(Integer idade) {
        if (idade >= 0 && idade <= 2) {
            System.out.println("bebê");
        } else if (idade >= 2 && idade <= 11) {
            System.out.println("Criança");
        } else if (idade >= 12 && idade <= 19) {
            System.out.println("Adolescente");
        } else if (idade >= 20 && idade <= 30) {
            System.out.println("Jovem");
        } else if (idade >= 31 && idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
