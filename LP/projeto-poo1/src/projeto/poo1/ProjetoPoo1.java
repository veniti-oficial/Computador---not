package projeto.poo1;

import java.util.Scanner;



public class ProjetoPoo1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        contaCorrente conta1 = new contaCorrente();
        contaCorrente conta2 = new contaCorrente();
        
        conta1.nome = "Diego";
        conta1.saldo = 20.0;
        
        conta2.nome = "Manoel";
        conta2.saldo = 0.0;
        
        conta1.sacar(Double.NaN);
        
        System.out.println(conta1.saldo);
    }    
}


