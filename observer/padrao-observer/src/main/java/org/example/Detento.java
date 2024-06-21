package org.example;

public class Detento implements Observer{

    private String status;

    private String nome;

    public void atualizar(String status) {
        this.status = status;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Status da cela do detento " + this.nome + ": " + this.status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
