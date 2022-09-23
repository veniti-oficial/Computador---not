public class Acionista implements Bonificavel{
    private String nome;
    private Integer qtdAcoes;
    private Double precoAcoes;

    public Acionista(String nome, Integer qtdAcoes, Double precoAcoes) {
        this.nome = nome;
        this.qtdAcoes = qtdAcoes;
        this.precoAcoes = precoAcoes;
    }

    public String getNome() {
        return nome;
    }


    public Integer getQtdAcoes() {
        return qtdAcoes;
    }


    public Double getPrecoAcoes() {
        return precoAcoes;
    }

    @Override
    public Double getValorBonus() {
        Double total = qtdAcoes * precoAcoes;
        return total * 0.25;
    }

    @Override
    public String toString() {
        return "Acionista{" +
                "nome='" + nome + '\'' +
                ", qtdAcoes=" + qtdAcoes +
                ", precoAcoes=" + precoAcoes +
                ", valor Bonus=" + getValorBonus() +
                '}';
    }
}
