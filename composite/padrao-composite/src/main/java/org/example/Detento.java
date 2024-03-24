package org.example;

public class Detento {

    private Dados dados;

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public String getDados() {
        if (this.dados == null) {
            throw new NullPointerException("Detento sem dados");
        }
        return this.dados.getDados();
    }
}
