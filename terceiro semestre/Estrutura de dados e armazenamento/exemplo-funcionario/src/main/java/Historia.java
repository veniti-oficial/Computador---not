public class Historia extends Funcionario{

    private Integer qtdHora;
    private Double valorHora;

    public Historia(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularSalario() {
        return qtdHora*valorHora;
    }

    @Override
    public String toString() {
        return "Historia{" +
                "qtdHora=" + qtdHora +
                ", valorHora=" + valorHora +
                 ",salário=" + calcularSalario() +
                   "} " + super.toString();
    }
}
