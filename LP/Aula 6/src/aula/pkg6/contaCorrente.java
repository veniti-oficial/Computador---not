package aula.pkg6;

import javax.swing.JTextField;

public class contaCorrente {
    private String nomeTitular;
    private Double saldo;

    public contaCorrente(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    contaCorrente(JTextField lblValorDigitado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    
    
    public void depositar(Double valorDeposito){
        saldo += valorDeposito;
    }
    
    public void sacar(Double valorSaque){
        saldo -= valorSaque;
    }
}
