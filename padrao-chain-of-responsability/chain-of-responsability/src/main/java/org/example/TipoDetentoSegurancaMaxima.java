package org.example;

public class TipoDetentoSegurancaMaxima implements TipoDetento {

    private static TipoDetentoSegurancaMaxima tipoDetentoSegurancaMaxima = new TipoDetentoSegurancaMaxima();

    private TipoDetentoSegurancaMaxima() {
    }

    ;

    public static TipoDetentoSegurancaMaxima getTipoDetentoSegurancaMaxima() {
        return tipoDetentoSegurancaMaxima;
    }
}
