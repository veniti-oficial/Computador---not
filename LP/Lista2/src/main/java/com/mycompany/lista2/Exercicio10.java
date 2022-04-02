package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;

        for (Integer i = 0; i < 10; i++) {
            System.out.println("Vote na sua pizza preferida");
            Integer voto = leitor.nextInt();

            switch (voto) {
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                case 50:
                    quatroQueijos++;
                    break;
                default:
                    System.out.println("voto invalido");
                    i--;
                    break;
            }
        }
        
                    switch (voto) {
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                case 50:
                    quatroQueijos++;
                    break;
                default:
                    System.out.println("voto invalido");
                    i--;
                    break;
            }
        }
        //String frase = String.format("Mussarela = %d /n Calabresa = %d /n"
          //      + "Quatro Queijos = %d /n Pizza campeã = %d");
                
        if(mussarela > calabresa && mussarela > quatroQueijos){
        String frase = String.format("Mussarela = %d /r Calabresa = %d /r"
                + "Quatro Queijos = %d /r Pizza campeã = mussarela", mussarela, 
                calabresa, quatroQueijos);
            System.out.println(frase);
        }
        
        if(calabresa > mussarela && calabresa > quatroQueijos){
        String frase = String.format("Mussarela = %d /r Calabresa = %d /r"
                + "Quatro Queijos = %d /r Pizza campeã = calabresa", mussarela, 
                calabresa, quatroQueijos);
            System.out.println(frase);            
        }

        if(quatroQueijos > mussarela && quatroQueijos > calabresa){
        String frase = String.format("Mussarela = %d /r Calabresa = %d /r"
                + "Quatro Queijos = %d /r Pizza campeã = quantro queijos", mussarela, 
                calabresa, quatroQueijos);
            System.out.println(frase);                 
        }
    }
}
