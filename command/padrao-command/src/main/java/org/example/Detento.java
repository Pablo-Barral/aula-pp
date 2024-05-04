package org.example;

public class Detento {

    private String nome;
    private String status;

    public Detento(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void soltarDetento() {
        this.status = "Detento solto";
    }

    public void prenderDetento() {
        this.status = "Detento preso";
    }
}
