package com.mycompany.aula8;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {
        System.out.println("teste");
        
//        String[] teste = new String[10];

//        Sintaxe padrão para inicializar uma lista;
          List listaEstranha = new ArrayList();
          
          // O método add permitr adicionar um valor na lista;
          listaEstranha.add("Manoel");          
          listaEstranha.add(10);
          listaEstranha.add(42.0);
          listaEstranha.add(true);
          
          System.out.println(listaEstranha);
          
//          declarando padrão definindo um tipo para nossa lista (Generic type)         
          List<String> nomes = new ArrayList();
          List<Integer> idades = new ArrayList();

          
          nomes.add("Manoel");
          nomes.add("Diego");
          nomes.add("Gerson");
          idades.add(13);
          idades.add(18);

//          Size retorna a qantidade de itens dentro do Array
//          

//         for (int i = 0; i < nomes.size; i++){
//             System.out.println(nomes.get(i));
//         }

        System.out.println("antes do remove");
        for (String nome : nomes) {
               System.out.println("nome: "+nomes);
        }

        nomes.remove(0);
        
        System.out.println("Depois do remove");
        for (String nome : nomes) {
            System.out.println("nome: "+nome);
        }
        
        nomes.set(0, "Frizza");
        
        System.out.println("-".repeat(15));
        System.out.println("Depois do set (frizza)");
        
        for(String nome: nomes) {
            System.out.println("Nome: " +nome);
        }
        
        nomes.add(0, "Alex");
        
        System.out.println("-".repeat(15));
        System.out.println("Depois do add (0,Alex)");
        
        for (String nome : nomes) {
            System.out.println("Nome: "+ nome);
        }
        
        Animacao a1 = new Animacao("Shrek", 2001);
        Animacao a2 = new Animacao("Espanta tubarões", 2005);
        Animacao a3 = new Animacao("Irmãos urso", 2003);
        Animacao a4 = new Animacao("Procurando Nemo", 2002);
        
        List<Animacao> animacoes = new ArrayList();
        animacoes.add(a1);
        animacoes.add(a2);
        animacoes.add(a3);
        animacoes.add(a4);

        for (Animacao animacao : animacoes) {
            System.out.println(animacao);
        }

    }
}
