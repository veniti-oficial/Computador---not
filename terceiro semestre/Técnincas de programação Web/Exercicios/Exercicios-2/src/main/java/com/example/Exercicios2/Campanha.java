package com.example.Exercicios2;

public class Campanha {
    private String nome;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    public Campanha(String nome, Integer vitorias, Integer derrotas, Integer empates) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
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
}
