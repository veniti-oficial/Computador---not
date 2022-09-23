package lista.pkg4;

public class Empregado {
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario(Double porcentagemReajuste){
        salario += (porcentagemReajuste / 100) * salario;
                
        System.out.println(String.format("nome = %s\n"
                + "cargo = %s\n"
                + "Salario = %.2f", nome, cargo, salario));
    }
}
