package com.example.Lutadores;

public class Lutador {
    private String nome;
    private Integer forcaGolpe;
    private Integer forcaDefesa;
    private Integer vida;

    public Lutador(String nome, Integer forcaGolpe, Integer forcaDefesa) {
        this.nome = nome;
        this.forcaGolpe = forcaGolpe;
        this.forcaDefesa = forcaDefesa;
        this.vida = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getForcaGolpe() {
        return forcaGolpe;
    }

    public void setForcaGolpe(Integer forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public Integer getForcaDefesa() {
        return forcaDefesa;
    }

    public void setForcaDefesa(Integer forcaDefesa) {
        this.forcaDefesa = forcaDefesa;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
}
