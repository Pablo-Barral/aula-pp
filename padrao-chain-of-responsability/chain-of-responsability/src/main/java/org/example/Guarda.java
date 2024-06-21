package org.example;

import java.util.ArrayList;

public abstract class Guarda {

    protected ArrayList listaDetentos = new ArrayList();
    private Guarda guardaSuperior;

    public void setGuardaSuperior(Guarda guardaSuperior) {
        this.guardaSuperior = guardaSuperior;
    }

    public abstract String getDescricaoCargo();

    public String liberarDetento(Detento detento) {
        if (listaDetentos.contains(detento.getTipoDetento())) {
            return getDescricaoCargo();
        } else {
            if (guardaSuperior != null) {
                return guardaSuperior.liberarDetento(detento);
            } else {
                return "Sem permissão para liberar";
            }
        }
    }
}
