package com.example.aula1409;

import java.math.BigDecimal;
import java.util.UUID;

public class Fruta {
    private UUID id = UUID.randomUUID();
    private String nome;
    private BigDecimal preco;

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
