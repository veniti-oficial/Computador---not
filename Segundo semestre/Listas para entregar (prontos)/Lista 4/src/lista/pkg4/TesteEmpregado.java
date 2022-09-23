package lista.pkg4;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();
        
        empregado1.nome = "João";
        empregado1.cargo = "Analista de Sistemas";
        empregado1.salario = 5400.00;
        
        empregado2.nome = "Vinicius";
        empregado2.cargo = "Desenvolvedor Sênior";
        empregado2.salario = 11200.00;
        
        empregado1.reajustarSalario(15.00);
        empregado2.reajustarSalario(32.00);
    }
}
