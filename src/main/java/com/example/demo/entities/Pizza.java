package com.example.demo.entities;

import com.example.demo.interfaces.Recheavel;

public class Pizza extends Lanche  implements Recheavel {
    private int tamanho;
    private int quantidadeRecheio = 1;
    private boolean borda;

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidadeRecheio() {
        return this.quantidadeRecheio;
    }

    public void setQuantidadeRecheio(int quantidadeRecheio) {
        this.quantidadeRecheio = quantidadeRecheio;
    }

    public boolean getBorda() {
        return this.borda;
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }

    @Override
    public void aumentarRecheio() {
        if(this.quantidadeRecheio < 5) {
            this.quantidadeRecheio++;
        }
    }
    @Override
    public void diminuirRecheio() {
        if(this.quantidadeRecheio < 0) {
            this.quantidadeRecheio--;
        }
    }
}
