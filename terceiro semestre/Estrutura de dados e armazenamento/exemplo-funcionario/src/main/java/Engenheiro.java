public class Engenheiro extends Funcionario{

    //Atributo
    private Double salario;

    //construtor
    public Engenheiro(String cpf, String nome, Double salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    //Implementação do método abstrato
    @Override
    public Double calcularSalario() {
        return salario;
    }

    //toString()
    @Override
    public String toString() {
        return "Engenheiro{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
