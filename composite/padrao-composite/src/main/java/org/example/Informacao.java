package org.example;

public class Informacao extends Dados {

    private String nome;

    public Informacao(String descricao, String nome) {
        super(descricao);
        this.nome = nome;
    }

    public String getDados() {
        return this.getDescricao() + ": " + this.nome + "\n";
    }

}
