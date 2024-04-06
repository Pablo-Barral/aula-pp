package org.example;

public class Crime {

    private String nome;
    private String pena;

    public Crime(String nome, String pena) {
        this.nome = nome;
        this.pena = pena;
    }

    public String getNome() {
        return nome;
    }

    public String getPena() {
        return pena;
    }
}
