package org.example;

public class GuardaChefe extends Guarda {

    public GuardaChefe(Guarda superior) {
        listaDetentos.add(TipoDetentoSegurancaMedia.getTipoDetentoSegurancaMedia());
        listaDetentos.add(TipoDetentoSegurancaMinima.getTipoDetentoSegurancaMinima());

        setGuardaSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Chefe de Segurança";
    }

}
