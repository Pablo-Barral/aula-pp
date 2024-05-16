package org.example;

public class Detento {

    private String nome;
    private boolean naCela;

    public Detento(String nome, boolean naCela) {
        this.nome = nome;
        this.naCela = naCela;
    }

    public boolean isNaCela() {
        return naCela;
    }
}
