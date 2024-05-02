package org.example;

public class GuardaComum extends Guarda {

    public GuardaComum(Guarda superior) {
        listaDetentos.add(TipoDetentoSegurancaMinima.getTipoDetentoSegurancaMinima());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Guarda Comum";
    }
}
