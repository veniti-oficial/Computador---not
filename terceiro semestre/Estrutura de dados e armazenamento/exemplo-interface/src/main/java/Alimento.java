public class Alimento extends Produto{

    //Atributo
    private Integer quantVitamina;

    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    //Implementação do metodo getValorTributo

    @Override
    public Double getValorTributo() {
        return getPreco() * 0.15;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "quantVitamina=" + quantVitamina +
                "} " + super.toString();
    }
}
