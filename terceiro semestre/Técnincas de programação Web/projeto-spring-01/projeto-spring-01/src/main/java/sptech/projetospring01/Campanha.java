package sptech.projetospring01;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

public class Campanha {

    private UUID id = UUID.randomUUID();
    private String nome;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    private Boolean aproveitamento;

    private boolean classificado = false;

    public Campanha(String nome, Integer vitorias, Integer derrotas, Integer empates) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    //o GET e resposavél de colocar algum dado no Json
    //está anotação impede que o campo vá para o JSON

    //Esse (double) faz com que os atributos que eram Integer não trunquem o resultado,
    // faz o resultado vir double

    public Double getAproveitamento() {
        return (double) this.getPontos() /
                ((this.getDerrotas() + this.getEmpates() + this.getVitorias()) * 3) * 100;
    }

    @JsonIgnore
    public UUID getId() {
        return id;
    }

    public Integer getPontos() {
        return  this.vitorias*3 + this.empates;
    }

    public String getNome() {
        return nome;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public boolean isClassificado() {
        return classificado;
    }
}
