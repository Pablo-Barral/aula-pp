package org.example;

public class Visitante implements Pessoa {

    private String nome;
    private Detento detento;
    private String parentesco;

    public Visitante(String nome, Detento detento, String parentesco) {
        this.nome = nome;
        this.detento = detento;
        this.parentesco = parentesco;
    }

    public String getNome() {
        return nome;
    }

    public Detento getDetento() {
        return detento;
    }

    public String getParentesco(){
        return parentesco;
    }

    public String accept(Visitor visitor) {
        return visitor.showVisitante(this);
    }

}
