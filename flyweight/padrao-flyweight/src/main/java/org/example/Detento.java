package org.example;

public class Detento {

    private String nome;
    private Crime crime;

    public Detento(String nome, Crime crime) {
        this.nome = nome;
        this.crime = crime;
    }

    public String getDetento() {
        return "Detento{" +
                "Nome='" + this.nome + '\'' +
                ", Crime='" + crime.getNome() + '\'' +
                ", Pena='" + crime.getPena() + '\'' +
                '}';
    }
}
