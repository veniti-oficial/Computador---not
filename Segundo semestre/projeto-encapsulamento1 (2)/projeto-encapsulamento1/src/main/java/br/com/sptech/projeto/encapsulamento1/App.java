
package br.com.sptech.projeto.encapsulamento1;

import java.util.Scanner;


public class App {
   
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("#123", "Manoel", "ADS");

        
//        aluno1.ra = "#123";
//        aluno1.nome = "Manoel";
//        aluno1.curso = "Análise e desenvolvimento de sistemas";
//        aluno1.nota1 = 10.0;
//        aluno1.nota2 = 100.0;
//        
//        System.out.println(String.format("RA: %s", aluno1.ra));
//        System.out.println(String.format("Nome: %s", aluno1.nome));
//        System.out.println(String.format("Curso: %s", aluno1.curso));
//        System.out.println(String.format("Nota 1: %.1f", aluno1.nota1));
//        System.out.println(String.format("Nota 2: %.1f", aluno1.nota2));
//        System.out.println(String.format("Média: %.1f", 
//                (aluno1.nota1 + aluno1.nota2) / 2));
//
       
//        System.out.println(String.format("RA: %s", aluno1.getRa()));
//        System.out.println(String.format("Nome: %s", aluno1.getNome()));
//        System.out.println(String.format("Curso: %s", aluno1.getCurso()));
//        System.out.println(String.format("Nota 1: %.1f", aluno1.getNota1()));
//        System.out.println(String.format("Nota 2: %.1f", aluno1.getNota2()));
//        System.out.println(String.format("Média: %.1f", aluno1.getMedia()));
        
        System.out.println(aluno1);
    }
}
