package org.example;

public class GuardaDiretor extends Guarda {

    public GuardaDiretor(Guarda superior) {
        listaDetentos.add(TipoDetentoSegurancaMaxima.getTipoDetentoSegurancaMaxima());
        listaDetentos.add(TipoDetentoSegurancaMedia.getTipoDetentoSegurancaMedia());
        listaDetentos.add(TipoDetentoSegurancaMinima.getTipoDetentoSegurancaMinima());

        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor da Prisão";
    }

}
