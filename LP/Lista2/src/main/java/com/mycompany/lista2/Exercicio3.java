package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
/*        Scanner leitor = new Scanner(System.in);;
        String Cusuario = "admin";
        String Csenha = "#Bandtec";
        
        
        System.out.println("Digite o nome de usuario");
        String usuario = leitor.next();
        
        System.out.println("Digite a Senha");
        String senha = leitor.next();
        
        if(usuario == "admin" && senha == "#Bandtec"){
            System.out.println("Login realizado com sucesso");
        }else{
        while(){
            System.out.println("usuario ou senha invalidos");
        
            System.out.println("Digite novamente o usuario");
            usuario = leitor.next();
            System.out.println("Digite novamente a sua senha");
            senha = leitor.next();
        }
        }*/

        /*Scanner leitor = new Scanner(System.in);
        String usuario = "admin";
        String senha = "#Bandtec";

        System.out.println("Digite seu usuario");
        String usuarioD = leitor.nextLine();
        
        System.out.println("Digite sua Senha");
        String senhaD = leitor.nextLine();
      
              do {            
            System.out.println("Digite seu usuario e senha");
             usuarioD = leitor.nextLine();
             senhaD = leitor.nextLine();
        } while (usuario != usuarioD && senha != senhaD);
         
        
        
        System.out.println("Login realizado com sucesso!");
        */
        
        //Scanner leitor = new leitor(System.in);
        //String usuario = "admin";
        //String senha = "#Bandtec";
        
        //System.out.println("Digite seu usuario");
        //String usuarioD = leitor.next();
        
        Scanner leitor = new  Scanner(System.in);
        
        System.out.println("Insira usuario: ");
        String usuario = leitor.nextLine();
        
        System.out.println("Insira sua senha: ");
        String senha = leitor.nextLine();
        
        if (!usuario.equals("admin") && !senha.equals("bandtec")) {
            System.out.println("Login e/ou senha inválidos");
            usuario = leitor.nextLine();
            senha = leitor.nextLine();
        }else {
            System.out.println("Login realizado com sucesso");
        }
        
    }
        
        }
