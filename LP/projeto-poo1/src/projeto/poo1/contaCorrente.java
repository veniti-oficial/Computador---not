package projeto.poo1;

import java.util.Scanner;

public class contaCorrente {
    Scanner leitor = new Scanner(System.in);
    
    // declarando caracteristicas  == Atributo/
    String nome;
    Double saldo;
    
    
    
    // comportamentos == metodos/
    void sacar(Double valor){
        saldo -= leitor.nextDouble();
        
        if(saldo < 0){
            System.out.println("Você não tem direito ao credito especial");
        }else{
            System.out.println(String.format("Você sacou %.2f", saldo));
        }
    }
    
    
    void depositar(Double valor){
        saldo += leitor.nextDouble();
    }
    
    
}
