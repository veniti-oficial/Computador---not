package com.mycompany.lista3;


public class calcularPesoIdeal {


        Double peso(String genero, Double altura){
        Double pesoIdeal = 0.0;
        
        if(genero.equals("M")){
            pesoIdeal = (72.7 * altura) - 58;
        }else if(genero.equals("F")){
            pesoIdeal = (62.1 * altura) - 44.7;
        }else{
            System.out.println("Gênero invalido, reinicie o programa");
        }
        
        return pesoIdeal;
    }
}
