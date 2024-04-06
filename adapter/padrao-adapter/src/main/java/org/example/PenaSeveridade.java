package org.example;

public class PenaSeveridade implements IPena {

    private String severidade;

    @Override
    public String getPena() {
        return this.severidade;
    }

    @Override
    public void setPena(String severidade) {
        this.severidade = severidade;
    }
}
