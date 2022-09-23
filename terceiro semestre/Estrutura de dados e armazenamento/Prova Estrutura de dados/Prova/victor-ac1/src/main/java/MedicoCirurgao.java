public class MedicoCirurgao extends Medico{

    private Integer qtdCirurgia;
    private Double valorCirurgia;
    private Double valorAplicacaoAnestesia;

    public MedicoCirurgao(String crm, String nome, Integer qtdCirurgia, Double valorCirurgia, Double valorAplicacaoAnestesia) {
        super(crm, nome);
        this.qtdCirurgia = qtdCirurgia;
        this.valorCirurgia = valorCirurgia;
        this.valorAplicacaoAnestesia = valorAplicacaoAnestesia;
    }

    public Integer getQtdCirurgia() {
        return qtdCirurgia;
    }

    public void setQtdCirurgia(Integer qtdCirurgia) {
        this.qtdCirurgia = qtdCirurgia;
    }

    public Double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(Double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

    public Double getValorAplicacaoAnestesia() {
        return valorAplicacaoAnestesia;
    }

    public void setValorAplicacaoAnestesia(Double valorAplicacaoAnestesia) {
        this.valorAplicacaoAnestesia = valorAplicacaoAnestesia;
    }

    @Override
    public Double getValorBonus() {
        return getGanho() * 0.15;
    }

    @Override
    public Double getGanho() {
        return qtdCirurgia * (valorCirurgia + valorAplicacaoAnestesia);
    }

    @Override
    public String toString() {
        return "medicoCirurgao{" +
                "qtdCirurgia=" + qtdCirurgia +
                ", valorCirurgia=" + valorCirurgia +
                ", valorAplicacaoAnestesia=" + valorAplicacaoAnestesia +
                "} " + super.toString();
    }
}
