package com.mycompany.victor.veniti.c1;

import java.util.Scanner;

public class loja {
    public static void main(String[] args) {
        //FASE 1
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bem-vindo administrador! Faça o controle de metas e "
                + "estoque: \n Quantidade de produtos em estoque:");
        Integer quantidadeProdutos = leitor.nextInt();
        
        System.out.println("\nMeta de vendas (%)");
        Double meta = leitor.nextDouble();
        
        Double calcularMeta = (meta / 100) * quantidadeProdutos;
        System.out.println(String.format("\nPara atingir a meta, você "
                + "precisa vender %.0f produtos!\n", calcularMeta));
        
        // FASE 2
        while(quantidadeProdutos > 0){
        System.out.println("Escolha os próximos passos \n1 - Realizar Venda \n"
                + "2 - Sair");
        
        Integer opcao = leitor.nextInt();
        
        switch (opcao){
            case 2:
            System.out.println("até logo");
            break;
            case 1:
                
            // FASE 3
            System.out.println("\nDigite a quantidade de produtos desejados");
            Integer quantidadeRequerida = leitor.nextInt();
            
            while(quantidadeRequerida < 0 || 
                    quantidadeRequerida > quantidadeProdutos){
                System.out.println(String.format("Infelizmente não temos"
                        + "a quantidade de produtos digitada.\n"
                        + "Quantidade disponivel %d\n"
                        + "Digite uma quantidade válida:", quantidadeProdutos));
                quantidadeRequerida = leitor.nextInt();
            }
            
                Integer registroProduto = 0;
            for(Integer i = 0; i < quantidadeRequerida; i++){
                quantidadeProdutos--;
                registroProduto++;
                
                System.out.println(String.format("Venda do %d° produto registrada,"
                        + "restam %d em estoque", registroProduto, quantidadeProdutos));
            }
            
            System.out.println(String.format("Você acabou de vender %d sua meta e vender %.0f",
                    quantidadeRequerida, calcularMeta));
            
            default:
            System.out.println("numero inválido");
            break;
        }
        
        switch(opcao){
        case 2:
            break;
        }

    }
    
 }
}