public abstract class Funcionario {
    //atributos
    private String cpf;
    private String nome;


    //construtor
    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    //Métodos

    //Método abstrato
    public abstract Double calcularSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getCpf() {
        return cpf;
    }
}
