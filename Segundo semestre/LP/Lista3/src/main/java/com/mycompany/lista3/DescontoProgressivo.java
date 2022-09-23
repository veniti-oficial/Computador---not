package com.mycompany.lista3;

public class DescontoProgressivo {
    Double ExibirNotaFiscal(Double valor, Integer quantidade){
        Double total = quantidade * valor;
        Double desconto = total;
        System.out.println(total);
        if(quantidade == 1){
            desconto -= calcularDesconto(valor, 0.1);
        }else if(quantidade == 2){
            desconto -= 2/100.0 * total;
            System.out.println(20.00/100 * total);
        }else if(quantidade == 3){
            desconto -= 30.00/100 * total;
        }else{total -= 10;}
        
            return desconto;
            
    }
    
    Double calcularDesconto(Double valor, Double porcentagem){
        return valor * porcentagem;
    }
    
    String teste(){
        return "----------------------------------------------";
    }
}
