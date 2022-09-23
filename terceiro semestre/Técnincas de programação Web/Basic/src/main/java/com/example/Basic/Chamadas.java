package com.example.Basic;
//O nome da classe era pra ser "Grife"
//O nome não pode ser no plural
//Na chave de acesso No pode ter o Get
public class Chamadas {
    private String nome;
    private Integer anoCriacao;
    private Double valorAcaoBolsa;
    private String chaveAcesso;

    public Chamadas(String nome, Integer anoCriacao, Double valorAcaoBolsa, String chaveAcesso) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.valorAcaoBolsa = valorAcaoBolsa;
        this.chaveAcesso = chaveAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public Double getValorAcaoBolsa() {
        return valorAcaoBolsa;
    }

    public void setValorAcaoBolsa(Double valorAcaoBolsa) {
        this.valorAcaoBolsa = valorAcaoBolsa;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }
}
