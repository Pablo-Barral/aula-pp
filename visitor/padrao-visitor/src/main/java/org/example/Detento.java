package org.example;

public class Detento implements Pessoa {

    private String nome;
    private int cela;
    private String crime;

    public Detento(String nome, int cela, String crime) {
        this.nome = nome;
        this.cela = cela;
        this.crime = crime;
    }

    public String getNome() {
        return nome;
    }

    public int getCela(){
        return cela;
    }

    public String getCrime(){
        return crime;
    }

    public String accept(Visitor visitor) {
        return visitor.showDetento(this);
    }

}
