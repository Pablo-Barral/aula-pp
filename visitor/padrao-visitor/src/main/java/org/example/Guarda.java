package org.example;

public class Guarda implements Pessoa {

    private String nome;

    public Guarda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String accept(Visitor visitor) {
        return visitor.showGuarda(this);
    }

}
