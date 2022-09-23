public class Servico implements Tributavel{
    private String descricao;
    private Double preco;

    public Servico(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ",Tributo=" +getValorTributo() +
                '}';
    }
    //esqueci de colocar o Tributo



    @Override
    public Double getValorTributo() {
        return preco * 0.12;
    }
}
