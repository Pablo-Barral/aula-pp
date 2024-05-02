package org.example;

public class TipoDetentoPenaMorte implements TipoDetento {

    private static TipoDetentoPenaMorte tipoDetentoPenaMorte = new TipoDetentoPenaMorte();

    private TipoDetentoPenaMorte() {
    }

    ;

    public static TipoDetentoPenaMorte getTipoDetentoPenaMorte() {
        return tipoDetentoPenaMorte;
    }
}
