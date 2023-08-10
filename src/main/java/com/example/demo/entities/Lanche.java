package com.example.demo.entities;

public abstract class Lanche {
    private String id;
    private String nome;
    private String descricao;
    private Sabor sabor;
    private Double preco;

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Sabor getSabor() {
        return this.sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
