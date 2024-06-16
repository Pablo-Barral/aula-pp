package org.example;

public interface Detento {

    public default void tempoLivreDetento() {
        abrirCela();
        rotinaTempoLivre();
        fecharCela();
    }

    public String rotinaTempoLivre();

    private void abrirCela() {
        System.out.println("Cela aberta");
        System.out.println("Detentos liberados");
    }

    private void fecharCela() {
        System.out.println("Detentos recolhidos");
        System.out.println("Cela fechada");
    }
}