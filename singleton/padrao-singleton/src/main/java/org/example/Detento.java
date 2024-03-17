package org.example;

public class Detento {

    private Detento() {
    }

    ;
    private static Detento instance = new Detento();

    public static Detento getInstance() {
        return instance;
    }

    private String nomeDetento;
    private String guardaLogado;

    public String getNomeDetento() {
        return nomeDetento;
    }

    public void setNomeDetento(String nomeDetento) {
        this.nomeDetento = nomeDetento;
    }

    public String getGuardaLogado() {
        return guardaLogado;
    }

    public void setGuardaLogado(String guardaLogado) {
        this.guardaLogado = guardaLogado;
    }
}
