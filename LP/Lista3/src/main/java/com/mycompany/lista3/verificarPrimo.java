package com.mycompany.lista3;

public class verificarPrimo {
    Integer numeroPrimo(Integer numeroDIgitado){
        Integer qtd = 0;
        
        
        for(Integer i = 1; i <= numeroDIgitado; i++){
            if(numeroDIgitado % i == 0){
                qtd++;
            }
        }
        System.out.println(qtd);
        return qtd;
        
    }
}
