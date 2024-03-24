package org.example;

public abstract class Dados {

    private String descricao;

    public Dados(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract String getDados();
}
