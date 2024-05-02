package org.example;

public class TipoDetentoSegurancaMedia implements TipoDetento {

    private static TipoDetentoSegurancaMedia tipoDetentoSegurancaMedia = new TipoDetentoSegurancaMedia();

    private TipoDetentoSegurancaMedia() {
    }

    ;

    public static TipoDetentoSegurancaMedia getTipoDetentoSegurancaMedia() {
        return tipoDetentoSegurancaMedia;
    }

}
