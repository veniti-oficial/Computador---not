public abstract class Produto implements Tributavel {

    //atributos
    private Integer codigo;
    private String descricao;
    private Double preco;

    //contrutor

    public Produto(Integer codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    //NÃO PRECISA COLOCAR O METODO DA INTERFACE JÁ QUE ESTAMOS EM UMA CLASSE ABSTRATA


    public Double getPreco() {
        return preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", Tributo =" + getValorTributo() +
                '}';
    }
}
