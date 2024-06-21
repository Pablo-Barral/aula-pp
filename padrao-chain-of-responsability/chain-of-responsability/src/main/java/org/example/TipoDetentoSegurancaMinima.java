package org.example;

public class TipoDetentoSegurancaMinima implements TipoDetento {

    private static TipoDetentoSegurancaMinima tipoDetentoSegurancaMinima = new TipoDetentoSegurancaMinima();

    private TipoDetentoSegurancaMinima() {
    }

    ;

    public static TipoDetentoSegurancaMinima getTipoDetentoSegurancaMinima() {
        return tipoDetentoSegurancaMinima;
    }

}
