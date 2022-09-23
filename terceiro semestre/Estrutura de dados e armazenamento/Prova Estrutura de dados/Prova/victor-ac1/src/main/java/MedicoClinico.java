public class MedicoClinico extends Medico{

private Integer qtdConsulta;
private Double valorConsulta;

    public MedicoClinico(String crm, String nome, Integer qtdConsulta, Double valorConsulta) {
        super(crm, nome);
        this.qtdConsulta = qtdConsulta;
        this.valorConsulta = valorConsulta;
    }

    public Integer getQtdConsulta() {
        return qtdConsulta;
    }

    public void setQtdConsulta(Integer qtdConsulta) {
        this.qtdConsulta = qtdConsulta;
    }

    public Double getCalorConsulta() {
        return valorConsulta;
    }

    public void setCalorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public Double getValorBonus() {

        return getGanho() * 0.10;
    }

    @Override
    public Double getGanho() {
        return qtdConsulta * valorConsulta;
    }

    @Override
    public String toString() {
        return "medicoClinico{" +
                "qtdConsulta=" + qtdConsulta +
                ", calorConsulta=" + valorConsulta +
                "} " + super.toString();
    }
}
